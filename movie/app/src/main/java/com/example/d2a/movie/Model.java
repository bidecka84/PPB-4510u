package com.example.d2a.movie;



    public class Model {

        private String title;
        private String rating;
        private String status;

        public Model(String title, String rating, String status) {
            this.title = title;
            this.rating = rating;
            this.status = status;

        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getRating() {
            return rating;
        }

        public void setRating(String rating) {
            this.rating = rating;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }
