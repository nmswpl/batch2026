#!/bin/bash

set -e

# -----------------------------
# Configuration
# -----------------------------
TEMPLATE_MODULE="jdbc-training"
BASE_BRANCH="main"
STUDENTS_FILE="branchName.txt"

# Your GitHub Personal Access Token
# export GITHUB_TOKEN=ghp_xxxxxxxxxxxxxxxxxxxxx
GITHUB_TOKEN="${GITHUB_TOKEN:-}"

# -----------------------------
# Validation
# -----------------------------
[ -d "$TEMPLATE_MODULE" ] || {
    echo "Template module '$TEMPLATE_MODULE' not found."
    exit 1
}

[ -f "$STUDENTS_FILE" ] || {
    echo "Student file '$STUDENTS_FILE' not found."
    exit 1
}

git checkout "$BASE_BRANCH"
git pull origin "$BASE_BRANCH"

# Configure remote with token if supplied
if [ -n "$GITHUB_TOKEN" ]; then
    REMOTE_URL=$(git remote get-url origin)

    if [[ "$REMOTE_URL" == https://* ]]; then
        AUTH_URL=$(echo "$REMOTE_URL" | sed "s#https://#https://${GITHUB_TOKEN}@#")
        git remote set-url origin "$AUTH_URL"
    fi
fi

# -----------------------------
# Create branches
# -----------------------------
while IFS= read -r student || [ -n "$student" ]
do
    # Skip empty lines/comments
    [[ -z "$student" ]] && continue
    [[ "$student" =~ ^# ]] && continue

    echo
    echo "========================================="
    echo "Processing $student"
    echo "========================================="

    git checkout "$BASE_BRANCH"

    if git show-ref --verify --quiet refs/heads/$student; then
        git branch -D "$student"
    fi

    git checkout -b "$student"

    rm -rf "$student"

    cp -R "$TEMPLATE_MODULE" "$student"

    rm -rf "$student/build"
    rm -rf "$student/.gradle"

    git add "$student"

    git commit -m "Add module $student"

    git push -u origin "$student"

done < "$STUDENTS_FILE"

git checkout "$BASE_BRANCH"

echo
echo "Done!"
