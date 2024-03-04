
package library;

public class library {

        String title;
        int ammount;
        int id;
        String genre;
        String loanDate;
        String returnDate;

        public library(String title, int ammount, int id, String genre) {
            this.title = title;
            this.ammount = ammount;
            this.id = id;
            this.genre = genre;
        }

        public library(String loanDate,String returnDate) {

            this.loanDate = loanDate;
            this.returnDate = returnDate;

        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getAmmount() {
            return ammount;
        }

        public void setAmmount(int ammount) {
            this.ammount = ammount;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getGenre() {
            return genre;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public String getLoanDate() {
            return loanDate;
        }

        public void setLoanDate(String loanDate) {
            this.loanDate = loanDate;
        }

        public String getReturnDate() {
            return returnDate;
        }

        public void setReturnDate(String returnDate) {
            this.returnDate = returnDate;
        }

}
