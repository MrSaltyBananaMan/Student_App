package ie.atu;

class Student {
    private String name;
    private String email;
    private String course;

    public Student(){
        this.name = " ";
        this.email = " ";
        this.course = " ";
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String n){
        this.name = n;
    }

    public String getEmail()
    {
        return this.email;
    }

    public void setEmail(String e){
        this.email = e;
    }

    public String getCourse()
    {
        return this.course;
    }

    public void setCourse(String c){
        this.course = c;
    }
}
