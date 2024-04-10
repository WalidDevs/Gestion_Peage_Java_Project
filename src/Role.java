public class Role {
    private String role;
    public Role(String role){
        this.role=role;
    }
    public Role (Role obj ){
        this.role = obj.role;
    }
    public String get_role(){
        return this.role;
    }
    public void set_role( String role){
        this.role=role;
    }
}
