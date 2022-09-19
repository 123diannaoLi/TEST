
package com.auth.server.api.impl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.auth.server.api.impl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreateRole_QNAME = new QName("http://impl.api.server.auth.com/", "createRole");
    private final static QName _DeleteRoleResponse_QNAME = new QName("http://impl.api.server.auth.com/", "deleteRoleResponse");
    private final static QName _AllRoles_QNAME = new QName("http://impl.api.server.auth.com/", "allRoles");
    private final static QName _DeleteRole_QNAME = new QName("http://impl.api.server.auth.com/", "deleteRole");
    private final static QName _Authenticate_QNAME = new QName("http://impl.api.server.auth.com/", "authenticate");
    private final static QName _CreateUserResponse_QNAME = new QName("http://impl.api.server.auth.com/", "createUserResponse");
    private final static QName _AuthenticateResponse_QNAME = new QName("http://impl.api.server.auth.com/", "authenticateResponse");
    private final static QName _DeleteUser_QNAME = new QName("http://impl.api.server.auth.com/", "deleteUser");
    private final static QName _CreateUser_QNAME = new QName("http://impl.api.server.auth.com/", "createUser");
    private final static QName _AddRoleToUser_QNAME = new QName("http://impl.api.server.auth.com/", "addRoleToUser");
    private final static QName _CheckRole_QNAME = new QName("http://impl.api.server.auth.com/", "checkRole");
    private final static QName _CreateRoleResponse_QNAME = new QName("http://impl.api.server.auth.com/", "createRoleResponse");
    private final static QName _DeleteUserResponse_QNAME = new QName("http://impl.api.server.auth.com/", "deleteUserResponse");
    private final static QName _InValidate_QNAME = new QName("http://impl.api.server.auth.com/", "inValidate");
    private final static QName _CheckRoleResponse_QNAME = new QName("http://impl.api.server.auth.com/", "checkRoleResponse");
    private final static QName _AddRoleToUserResponse_QNAME = new QName("http://impl.api.server.auth.com/", "addRoleToUserResponse");
    private final static QName _AllRolesResponse_QNAME = new QName("http://impl.api.server.auth.com/", "allRolesResponse");
    private final static QName _InValidateResponse_QNAME = new QName("http://impl.api.server.auth.com/", "inValidateResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.auth.server.api.impl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Authenticate }
     * 
     */
    public Authenticate createAuthenticate() {
        return new Authenticate();
    }

    /**
     * Create an instance of {@link CreateUserResponse }
     * 
     */
    public CreateUserResponse createCreateUserResponse() {
        return new CreateUserResponse();
    }

    /**
     * Create an instance of {@link AuthenticateResponse }
     * 
     */
    public AuthenticateResponse createAuthenticateResponse() {
        return new AuthenticateResponse();
    }

    /**
     * Create an instance of {@link CreateRole }
     * 
     */
    public CreateRole createCreateRole() {
        return new CreateRole();
    }

    /**
     * Create an instance of {@link AllRoles }
     * 
     */
    public AllRoles createAllRoles() {
        return new AllRoles();
    }

    /**
     * Create an instance of {@link DeleteRoleResponse }
     * 
     */
    public DeleteRoleResponse createDeleteRoleResponse() {
        return new DeleteRoleResponse();
    }

    /**
     * Create an instance of {@link DeleteRole }
     * 
     */
    public DeleteRole createDeleteRole() {
        return new DeleteRole();
    }

    /**
     * Create an instance of {@link InValidate }
     * 
     */
    public InValidate createInValidate() {
        return new InValidate();
    }

    /**
     * Create an instance of {@link CheckRoleResponse }
     * 
     */
    public CheckRoleResponse createCheckRoleResponse() {
        return new CheckRoleResponse();
    }

    /**
     * Create an instance of {@link InValidateResponse }
     * 
     */
    public InValidateResponse createInValidateResponse() {
        return new InValidateResponse();
    }

    /**
     * Create an instance of {@link AddRoleToUserResponse }
     * 
     */
    public AddRoleToUserResponse createAddRoleToUserResponse() {
        return new AddRoleToUserResponse();
    }

    /**
     * Create an instance of {@link AllRolesResponse }
     * 
     */
    public AllRolesResponse createAllRolesResponse() {
        return new AllRolesResponse();
    }

    /**
     * Create an instance of {@link DeleteUser }
     * 
     */
    public DeleteUser createDeleteUser() {
        return new DeleteUser();
    }

    /**
     * Create an instance of {@link CreateUser }
     * 
     */
    public CreateUser createCreateUser() {
        return new CreateUser();
    }

    /**
     * Create an instance of {@link CreateRoleResponse }
     * 
     */
    public CreateRoleResponse createCreateRoleResponse() {
        return new CreateRoleResponse();
    }

    /**
     * Create an instance of {@link DeleteUserResponse }
     * 
     */
    public DeleteUserResponse createDeleteUserResponse() {
        return new DeleteUserResponse();
    }

    /**
     * Create an instance of {@link AddRoleToUser }
     * 
     */
    public AddRoleToUser createAddRoleToUser() {
        return new AddRoleToUser();
    }

    /**
     * Create an instance of {@link CheckRole }
     * 
     */
    public CheckRole createCheckRole() {
        return new CheckRole();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateRole }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.api.server.auth.com/", name = "createRole")
    public JAXBElement<CreateRole> createCreateRole(CreateRole value) {
        return new JAXBElement<CreateRole>(_CreateRole_QNAME, CreateRole.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteRoleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.api.server.auth.com/", name = "deleteRoleResponse")
    public JAXBElement<DeleteRoleResponse> createDeleteRoleResponse(DeleteRoleResponse value) {
        return new JAXBElement<DeleteRoleResponse>(_DeleteRoleResponse_QNAME, DeleteRoleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllRoles }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.api.server.auth.com/", name = "allRoles")
    public JAXBElement<AllRoles> createAllRoles(AllRoles value) {
        return new JAXBElement<AllRoles>(_AllRoles_QNAME, AllRoles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteRole }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.api.server.auth.com/", name = "deleteRole")
    public JAXBElement<DeleteRole> createDeleteRole(DeleteRole value) {
        return new JAXBElement<DeleteRole>(_DeleteRole_QNAME, DeleteRole.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Authenticate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.api.server.auth.com/", name = "authenticate")
    public JAXBElement<Authenticate> createAuthenticate(Authenticate value) {
        return new JAXBElement<Authenticate>(_Authenticate_QNAME, Authenticate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.api.server.auth.com/", name = "createUserResponse")
    public JAXBElement<CreateUserResponse> createCreateUserResponse(CreateUserResponse value) {
        return new JAXBElement<CreateUserResponse>(_CreateUserResponse_QNAME, CreateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.api.server.auth.com/", name = "authenticateResponse")
    public JAXBElement<AuthenticateResponse> createAuthenticateResponse(AuthenticateResponse value) {
        return new JAXBElement<AuthenticateResponse>(_AuthenticateResponse_QNAME, AuthenticateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.api.server.auth.com/", name = "deleteUser")
    public JAXBElement<DeleteUser> createDeleteUser(DeleteUser value) {
        return new JAXBElement<DeleteUser>(_DeleteUser_QNAME, DeleteUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.api.server.auth.com/", name = "createUser")
    public JAXBElement<CreateUser> createCreateUser(CreateUser value) {
        return new JAXBElement<CreateUser>(_CreateUser_QNAME, CreateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddRoleToUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.api.server.auth.com/", name = "addRoleToUser")
    public JAXBElement<AddRoleToUser> createAddRoleToUser(AddRoleToUser value) {
        return new JAXBElement<AddRoleToUser>(_AddRoleToUser_QNAME, AddRoleToUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckRole }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.api.server.auth.com/", name = "checkRole")
    public JAXBElement<CheckRole> createCheckRole(CheckRole value) {
        return new JAXBElement<CheckRole>(_CheckRole_QNAME, CheckRole.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateRoleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.api.server.auth.com/", name = "createRoleResponse")
    public JAXBElement<CreateRoleResponse> createCreateRoleResponse(CreateRoleResponse value) {
        return new JAXBElement<CreateRoleResponse>(_CreateRoleResponse_QNAME, CreateRoleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.api.server.auth.com/", name = "deleteUserResponse")
    public JAXBElement<DeleteUserResponse> createDeleteUserResponse(DeleteUserResponse value) {
        return new JAXBElement<DeleteUserResponse>(_DeleteUserResponse_QNAME, DeleteUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InValidate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.api.server.auth.com/", name = "inValidate")
    public JAXBElement<InValidate> createInValidate(InValidate value) {
        return new JAXBElement<InValidate>(_InValidate_QNAME, InValidate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckRoleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.api.server.auth.com/", name = "checkRoleResponse")
    public JAXBElement<CheckRoleResponse> createCheckRoleResponse(CheckRoleResponse value) {
        return new JAXBElement<CheckRoleResponse>(_CheckRoleResponse_QNAME, CheckRoleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddRoleToUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.api.server.auth.com/", name = "addRoleToUserResponse")
    public JAXBElement<AddRoleToUserResponse> createAddRoleToUserResponse(AddRoleToUserResponse value) {
        return new JAXBElement<AddRoleToUserResponse>(_AddRoleToUserResponse_QNAME, AddRoleToUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllRolesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.api.server.auth.com/", name = "allRolesResponse")
    public JAXBElement<AllRolesResponse> createAllRolesResponse(AllRolesResponse value) {
        return new JAXBElement<AllRolesResponse>(_AllRolesResponse_QNAME, AllRolesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InValidateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.api.server.auth.com/", name = "inValidateResponse")
    public JAXBElement<InValidateResponse> createInValidateResponse(InValidateResponse value) {
        return new JAXBElement<InValidateResponse>(_InValidateResponse_QNAME, InValidateResponse.class, null, value);
    }

}
