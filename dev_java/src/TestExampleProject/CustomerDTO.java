package TestExampleProject;

public class CustomerDTO {

    

    

    private String id;

    private String pwd;

    private String name;

    private String tel;

    private String addr;

    private String birth;

    private String job ;

    private String gender;

    private String email;

    private String intro;



    //이클립스팁 : Getter/Setter 만들기

    //             우클릭 -> source->Generate Getters And Setters-> [Select AlL] -> [OK]

   

   

    public String getId() {

           return id;

    }

    public void setId(String id) {

           this.id = id;

    }

    public String getPwd() {

           return pwd;

    }

    public void setPwd(String pwd) {

           this.pwd = pwd;

    }

    public String getName() {

           return name;

    }

    public void setName(String name) {

           this.name = name;

    }

    public String getTel() {

           return tel;

    }

    public void setTel(String tel) {

           this.tel = tel;

    }

    public String getAddr() {

           return addr;

    }

    public void setAddr(String addr) {

           this.addr = addr;

    }

    public String getBirth() {

           return birth;

    }

    public void setBirth(String birth) {

           this.birth = birth;

    }

    public String getJob() {

           return job;

    }

    public void setJob(String job) {

           this.job = job;

    }

    public String getGender() {

           return gender;

    }

    public void setGender(String gender) {

           this.gender = gender;

    }

    public String getEmail() {

           return email;

    }

    public void setEmail(String email) {

           this.email = email;

    }

    public String getIntro() {

           return intro;

    }

    public void setIntro(String intro) {

           this.intro = intro;

    }

   

    //DTO 객체 확인

    //이클립스팁 : toString() 자동생성: 우클릭 -> source -> Generate toString->[OK]

    @Override

    public String toString() {

           return "CustomerDTO [id=" + id + ", pwd=" + pwd + ", name=" + name

                        + ", tel=" + tel + ", addr=" + addr + ", birth=" + birth

                        + ", job=" + job + ", gender=" + gender + ", email=" + email

                        + ", intro=" + intro + "]";

    }

}