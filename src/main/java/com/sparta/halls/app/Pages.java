package com.sparta.halls.app;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

public class Pages {

    // == PUBLIC PAGES ==================================================================================
    public static final String PUBLIC_WELCOME               = "view/publicPages/welcome";
    public static final String PUBLIC_LOGIN                 = "view/publicPages/login";
    public static final String PUBLIC_LOGIN_ERROR           = "view/publicPages/login?error";
    public static final String PUBLIC_LOGOUT                = "view/publicPages/login?logout";
    public static final String PUBLIC_ENQUIRIES             = "view/publicPages/enquiries";
    public static final String PUBLIC_ENQUIRY_SENT          = "view/publicPages/success";
    public static final String PUBLIC_VIEW_HALLS            = "view/publicPages/halls";
    public static final String PUBLIC_VIEW_ROOMS            = "view/publicPages/rooms";
    public static final String PUBLIC_VIEW_SELECTED_ROOM    = "view/publicPages/roomTypes";
    public static final String PUBLIC_VIEW_ROOM_TYPES       = "view/publicPages/roomTypes";
    public static final String PUBLIC_VIEW_SELECTED_HALL    = "view/publicPages/selectedHall";

    // == STUDENT PAGES =================================================================================
    public static final String STUDENT_MAINTENANCE_REQUEST  = "view/studentPages/maintenanceRequest";
    public static final String STUDENT_BOOKING_REQUEST      = "view/studentPages/roomBooking";
    public static final String STUDENT_REQUEST_SENT         = "view/publicPages/success";
    public static final String STUDENT_RULES                = "view/studentPages/rulesRegulations";
    public static final String STUDENT_NOTICE_BOARD         = "view/studentPages/studentBoard";
    public static final String STUDENT_MAKE_POST            = "view/studentPages/makePosts";
    public static final String STUDENT_POST_SUCCESSFUL      = "view/studentPages/postSuccess";
    public static final String STUDENT_VIEW_MANAGEMENT      = "view/studentPages/managementStaff";
    public static final String NOM_STUDENT_DELETE_POST      = "view/studentPages/deletePosts";

    // == ADMIN PAGES ===================================================================================





    // == ERROR ===================================================================================
    public static final String ERROR_PAGE                    = "view/publicPages/error";


    public static String accessPage(String accessRole, String expectedPage) {
        HttpServletRequest request =
                ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
                        .getRequest();

        if (request != null) {
            if (request.isUserInRole(accessRole) || accessRole.equals(Roles.PUBLIC)) {
                return expectedPage;
            }
        }
        return ERROR_PAGE;
    }
}
