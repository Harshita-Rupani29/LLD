public class emplyeeClass implements emplyee {
  public int create(String type, int id) {
    System.out.println("User Created with id:" + id);
    return 0;
  }

  public int update(String type, int id) {
    System.out.println("User Updated with id:" + id);
    return 0;
  }

  public int delete(String type, int id) {
    System.out.println("User Deleted with id:" + id);
    return 0;
  }
}
