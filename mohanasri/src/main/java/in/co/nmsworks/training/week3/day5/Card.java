package in.co.nmsworks.training.week3.day5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

        public class Card {
            private final String suit;
            private final String value;

            public Card(String suit, String value) {
                this.suit = suit;
                this.value = value;
            }

            @Override
            public String toString() {
                return value + " of " + suit;
            }
        }





