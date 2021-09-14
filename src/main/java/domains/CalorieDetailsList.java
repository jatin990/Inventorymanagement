package domains;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CalorieDetailsList {

        private List<CalorieDetails> calorieDetailsList = new ArrayList<>();

        public void addDetails(CalorieDetails calorieDetails) {
            calorieDetailsList.add(calorieDetails);
        }

        public void addAllDetails(Collection<CalorieDetails> detailsCollection) {
            this.calorieDetailsList.addAll(detailsCollection);
        }

}
