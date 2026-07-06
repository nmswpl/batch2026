package in.co.nmsworks.training.week3.weekendpractice;

public class CricketPlayer {

        private String name;
        private String teamName;
        private int ballCount;
        private int runs;

        public CricketPlayer(String name, String teamName, int ballCount, int runs) {
            this.name = name;
            this.teamName = teamName;
            this.ballCount = ballCount;
            this.runs = runs;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTeamName() {
            return teamName;
        }

        public void setTeamName(String teamName) {
            this.teamName = teamName;
        }

        public int getBallCount() {
            return ballCount;
        }

        public void setBallCount(int ballCount) {
            this.ballCount = ballCount;
        }

        public int getRuns() {
            return runs;
        }

        public void setRuns(int runs) {
            this.runs = runs;
        }

        @Override
        public String toString() {
            return "CricketPlayer{" +
                    "name='" + name + '\'' +
                    ", teamName='" + teamName + '\'' +
                    ", ballCount=" + ballCount +
                    ", runs=" + runs +
                    '}';
        }
    }