
import com.auth.server.api.impl.AuthorizeImpl;
import com.auth.server.api.impl.AuthorizeImplService;
import com.auth.server.api.impl.Exception_Exception;

public class client {
    public static void main(String[] args){
        // wsdl method
        AuthorizeImplService service=new AuthorizeImplService();
        AuthorizeImpl serverTool = service.getPort(AuthorizeImpl.class);
        // API: create user.(case: user does not exist)
        String res = serverTool.createUser("jack", "123456");
        System.out.println(res);
        // API: create user.(case:  user  exists)
        res = serverTool.createUser("jack", "123456");
        System.out.println(res);
        // API: delete user.(case: user  exists)
        res = serverTool.deleteUser("jack");
        System.out.println(res);
        // API: delete user.(case: user does not  exist)
        res = serverTool.deleteUser("jack");
        System.out.println(res);
       // API: create role.(case: role does not  exist)
        res = serverTool.createRole("student");
        System.out.println(res);
        res = serverTool.createRole("sun");
        // API: create role.(case: role exists)
        res = serverTool.createRole("student");
        System.out.println(res);
        // API: delete role.(case: role exists)
        res = serverTool.deleteRole("student");
        System.out.println(res);
        // API: delete role.(case: role does not exist)
        res = serverTool.deleteRole("student");
        System.out.println(res);
        // API: add role to user.
        serverTool.createUser("jack", "123456");
        serverTool.createRole("student");
        serverTool.createRole("teacher");
        res = serverTool.addRoleToUser("student", "jack");
        res = serverTool.addRoleToUser("sun", "jack");
        System.out.println(res);
        // API: Authenticate
        String token = serverTool.authenticate("jack", "123456");
        System.out.println(token);
        // API: invalidate
        serverTool.inValidate(token);
        // API: check role (case: belongs to role)
        token = serverTool.authenticate("jack", "123456");
        res = serverTool.checkRole(token, "student");
        System.out.println(res);
        // API: check role (case: does not belong to role)
        res = serverTool.checkRole(token, "teacher");
        System.out.println(res);
        // API: all roles
        res = serverTool.allRoles(token);
        System.out.println(res);
    }
}
