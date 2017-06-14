package model;

/**
 * Created by andr_ on 14.06.2017.
 */
public enum AccessRight {
    Admin(1), User(2), Anonymous(5);

    private int num;

    private AccessRight(int num){
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public static AccessRight getRole(int num){
        switch (num) {
            case 1:
                return Admin;
            case 2:
                return User;
        }

        return Anonymous;
    }

    public static AccessRight getRole(String role){
        switch (role) {
            case "Admin":
                return Admin;
            case "User":
                return User;
        }
        return Anonymous;
    }



  //  public static LinkedList<AccessRight> getRoles() {
////        for (GrantedAuthority authority  : SecurityContextHolder.getContext().getAuthentication().getAuthorities()) {
//            roles.add(AccessRight.getRole(authority.getAuthority()));
  //      }
   //     return roles;
  //  }


}

