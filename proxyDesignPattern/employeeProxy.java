public class employeeProxy implements emplyee {
  emplyeeClass obj = new emplyeeClass();

  public int create(String type, int id) {
    if (type.equals("admin")) {
      return obj.create(type, id);
    } else {
      System.out.println("Access Denied for Id :" + id);
      return -1;
    }
  }

  public int update(String type, int id) {
    if (type == "admin") {
      return obj.update(type, id);
    } else {
      System.out.println("Access Denied for Id :" + id);
      return -1;
    }
  }

  public int delete(String type, int id) {
    if (type == "admin") {
      return obj.delete(type, id);
    } else {
      System.out.println("Access Denied for Id :" + id);
      return -1;
    }
  }
}
