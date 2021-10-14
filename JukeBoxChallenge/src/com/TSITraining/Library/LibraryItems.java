package com.TSITraining.Jukebox;

public abstract class LibraryItems<Education> {


    /////////////////////////////Attributes\\\\\\\\\\\\\\\\\\\\
        private String name;
        private String title;
        private int date;







    ////////////////////////////Constructor\\\\\\\\\\\\\\\\\\\\


    //////////////////////////////Methods\\\\\\\\\\\\\\\\\\\\\\\\
    //Methods of action and identifiers
    public void cognition(String stimulant) {
                System.out.println("I increase cognitive function");
    }
    public void storage(String information) {
                System.out.println("I store information as data");
    }
    public abstract void education(String knowledge);
    public abstract void entertained(String Fun);

    //Getters
    public String getName() {
            return name;

    }
    public String getTitle() {
            return title;
    }

    public int getDate() {
        return date;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
