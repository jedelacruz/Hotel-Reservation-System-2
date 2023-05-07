public class Student {
    private String name;
    private int id;
    private String strand;
    private String email;
    private int roomNumber,dayStay;
    private int totalCost;
    
    public Student(String name, int id, String strand, String email, int roomNumber, int dayStay) {
        this.name = name;
        this.id = id;
        this.strand = strand;
        this.email = email;
        this.roomNumber = roomNumber;
        this.dayStay = dayStay;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getStrand() {
        return strand;
    }

    public String getEmail() {
        return email;
    }
    
    public int getroomNumber() {
    	return roomNumber;
    }
    
    public int dayStay() {
    	return dayStay;
    }
    
    public int getTotalCost() {
        return totalCost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    public void setStrand(String strand) {
        this.strand = strand;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setroomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    
    public void setdayStay(int dayStay) {
        this.dayStay = dayStay;
    }
    
    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }
}
