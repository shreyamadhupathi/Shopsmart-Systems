/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.28
 * Generated at: 2024-08-31 03:03:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import com.revature.service.dao.*;
import com.revature.service.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/header.jsp", Long.valueOf(1725070724478L));
    _jspx_dependants.put("/footer.html", Long.valueOf(1725004106572L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(7);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("com.revature.service");
    _jspx_imports_packages.add("com.revature.service.dao");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Register</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/changes.css\">\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body style=\"background-color: #f5f5f5;\">\r\n");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Logout Header</title>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/changes.css\">\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("	\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background-color: #01ff12;font-family: Verdana, sans-serif;\">\r\n");
      out.write("	<!--Company Header Starting  -->\r\n");
      out.write("<div class=\"left\"\r\n");
      out.write("    style=\"margin-top: 45px; background-color: #d811df; color: #10bababa; padding: 20px; border-radius: 10px; box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2); max-width: 900px; margin: 45px auto;\">\r\n");
      out.write("    <div style=\"display: flex; justify-content: space-between; align-items: center;\">\r\n");
      out.write("        <!-- Left side: Search items -->\r\n");
      out.write("        <div style=\"flex: 1; margin-right: 20px;\">\r\n");
      out.write("            <h2 style=\"font-family: 'Arial', sans-serif; color: white;\">RevShop</h2>\r\n");
      out.write("            <h6 style=\"font-family: 'Arial', sans-serif; color: #f3f3f3;\">RevaElectronics Product</h6>\r\n");
      out.write("<form class=\"form-inline\" action=\"index.jsp\" method=\"get\">\r\n");
      out.write("    <div class=\"input-group\" style=\"display: flex; width: 100%; align-items: center;\">\r\n");
      out.write("        <input type=\"text\" class=\"form-control\" name=\"search\"\r\n");
      out.write("            placeholder=\"Search Items\" required\r\n");
      out.write("            style=\"flex: 1; border-radius: 30px 0 0 30px; padding: 10px; box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1); border: 1px solid #ccc; height: 45px;\">\r\n");
      out.write("\r\n");
      out.write("        <input type=\"submit\" class=\"btn btn-danger\" value=\"Search\"\r\n");
      out.write("            style=\"border-radius: 0 30px 30px 0; padding: 10px 20px; background-color: #f44336; border-color: #f44336; box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1); cursor: pointer; height: 45px;\">\r\n");
      out.write("    </div>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <!-- Right side: Special Deals -->\r\n");
      out.write("        <div style=\"flex: 1; background-color: #ff5722; color: white; padding: 10px; border-radius: 10px; text-align: center;\">\r\n");
      out.write("            <h3 style=\"margin: 0; font-family: 'Arial', sans-serif;\">Special Deals</h3>\r\n");
      out.write("            <p style=\"margin: 5px 0;\">Up to 50% off on selected items!</p>\r\n");
      out.write("            <p style=\"margin: 5px 0;\">Free Home Delivery Available</p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <p align=\"right\"\r\n");
      out.write("        style=\"color: orange; font-weight: bold; margin-top: 10px; margin-bottom: 5px; font-family: 'Arial', sans-serif;\"\r\n");
      out.write("        id=\"message\"></p>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	<!-- Company Header Ending -->\r\n");
      out.write("\r\n");
      out.write("	");

	/* Checking the user credentials */
	String userType = (String) session.getAttribute("usertype");
	if (userType == null) { //LOGGED OUT
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- Starting Navigation Bar -->\r\n");
      out.write("<nav class=\"navbar navbar-default navbar-fixed-top navbar-custom\">\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("        <div class=\"navbar-header\">\r\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("            <a class=\"navbar-brand\" href=\"index.jsp\">RevShop</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\r\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                <li><a href=\"register.jsp\">Register</a></li>\r\n");
      out.write("                <li><a href=\"login.jsp\">Login</a></li>\r\n");
      out.write("                <li><a href=\"index.jsp\">Products</a></li>\r\n");
      out.write("                <li class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Category <span class=\"caret\"></span></a>\r\n");
      out.write("                    <ul class=\"dropdown-menu\">\r\n");
      out.write("                        <li><a href=\"index.jsp?type=mobile\">Mobiles</a></li>\r\n");
      out.write("                        <li><a href=\"index.jsp?type=tv\">TVs</a></li>\r\n");
      out.write("                        <li><a href=\"index.jsp?type=laptop\">Laptops</a></li>\r\n");
      out.write("                        <li><a href=\"index.jsp?type=camera\">Camera</a></li>\r\n");
      out.write("                        <li><a href=\"index.jsp?type=speaker\">Speakers</a></li>\r\n");
      out.write("                        <li><a href=\"index.jsp?type=tablet\">Tablets</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <!-- New div for discount text -->\r\n");
      out.write("            <div class=\"navbar-text\" style=\"color: orange; margin-left: 10px;\">\r\n");
      out.write("                <strong>Get 20% off on all electronics! Use code: SAVE20</strong>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	");

	} else if ("customer".equalsIgnoreCase(userType)) { 

	int notf = new CartServiceImpl().getCartCount((String) session.getAttribute("username"));
	
      out.write("\r\n");
      out.write("	<nav class=\"navbar navbar-default navbar-fixed-top\">\r\n");
      out.write("\r\n");
      out.write("		<div class=\"container-fluid\">\r\n");
      out.write("			<div class=\"navbar-header\">\r\n");
      out.write("				<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\r\n");
      out.write("					data-target=\"#myNavbar\">\r\n");
      out.write("					<span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\r\n");
      out.write("						class=\"icon-bar\"></span>\r\n");
      out.write("				</button>\r\n");
      out.write("				<a class=\"navbar-brand\" href=\"userHome.jsp\"><span\r\n");
      out.write("					class=\"glyphicon glyphicon-home\">&nbsp;</span>RevShop</a>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<div class=\"collapse navbar-collapse\" id=\"myNavbar\">\r\n");
      out.write("				<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("					<li><a href=\"userHome.jsp\"><span\r\n");
      out.write("							class=\"glyphicon glyphicon-home\">Products</span></a></li>\r\n");
      out.write("					<li class=\"dropdown\"><a class=\"dropdown-toggle\"\r\n");
      out.write("						data-toggle=\"dropdown\" href=\"#\">Category <span class=\"caret\"></span>\r\n");
      out.write("					</a>\r\n");
      out.write("						<ul class=\"dropdown-menu\">\r\n");
      out.write("							<li><a href=\"userHome.jsp?type=mobile\">Mobiles</a></li>\r\n");
      out.write("							<li><a href=\"userHome.jsp?type=tv\">TV</a></li>\r\n");
      out.write("							<li><a href=\"userHome.jsp?type=laptop\">Laptops</a></li>\r\n");
      out.write("							<li><a href=\"userHome.jsp?type=camera\">Camera</a></li>\r\n");
      out.write("							<li><a href=\"userHome.jsp?type=speaker\">Speakers</a></li>\r\n");
      out.write("							<li><a href=\"userHome.jsp?type=tablet\">Tablets</a></li>\r\n");
      out.write("						</ul></li>\r\n");
      out.write("					");

					if (notf == 0) {
					
      out.write("\r\n");
      out.write("					<li><a href=\"cartDetails.jsp\"> <span\r\n");
      out.write("							class=\"glyphicon glyphicon-shopping-cart\"></span>Cart\r\n");
      out.write("					</a></li>\r\n");
      out.write("\r\n");
      out.write("					");

					} else {
					
      out.write("\r\n");
      out.write("					<li><a href=\"cartDetails.jsp\"\r\n");
      out.write("						style=\"margin: 0px; padding: 0px;\" id=\"mycart\"><i\r\n");
      out.write("							data-count=\"");
      out.print(notf);
      out.write("\"\r\n");
      out.write("							class=\"fa fa-shopping-cart fa-3x icon-white badge\"\r\n");
      out.write("							style=\"background-color: #333; margin: 0px; padding: 0px; padding-bottom: 0px; padding-top: 5px;\">\r\n");
      out.write("						</i></a></li>\r\n");
      out.write("					");

					}
					
      out.write("\r\n");
      out.write("					<li><a href=\"orderDetails.jsp\">Orders</a></li>\r\n");
      out.write("					<li><a href=\"userProfile.jsp\">Profile</a></li>\r\n");
      out.write("					<li><a href=\"./LogoutServlet\">Logout</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</nav>\r\n");
      out.write("	");

	} else {
	
      out.write("\r\n");
      out.write("	<nav class=\"navbar navbar-default navbar-fixed-top\">\r\n");
      out.write("		<div class=\"container-fluid\">\r\n");
      out.write("			<div class=\"navbar-header\">\r\n");
      out.write("				<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\r\n");
      out.write("					data-target=\"#myNavbar\">\r\n");
      out.write("					<span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\r\n");
      out.write("						class=\"icon-bar\"></span>\r\n");
      out.write("				</button>\r\n");
      out.write("				<a class=\"navbar-brand\" href=\"adminViewProduct.jsp\"><span\r\n");
      out.write("					class=\"glyphicon glyphicon-home\">&nbsp;</span>RevShop</a>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"collapse navbar-collapse\" id=\"myNavbar\">\r\n");
      out.write("				<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("					<li><a href=\"adminViewProduct.jsp\">Products</a></li>\r\n");
      out.write("					<li class=\"dropdown\"><a class=\"dropdown-toggle\"\r\n");
      out.write("						data-toggle=\"dropdown\" href=\"#\">Category <span class=\"caret\"></span>\r\n");
      out.write("					</a>\r\n");
      out.write("						<ul class=\"dropdown-menu\">\r\n");
      out.write("							<li><a href=\"adminViewProduct.jsp?type=mobile\">Mobiles</a></li>\r\n");
      out.write("							<li><a href=\"adminViewProduct.jsp?type=tv\">Tvs</a></li>\r\n");
      out.write("							<li><a href=\"adminViewProduct.jsp?type=laptop\">Laptops</a></li>\r\n");
      out.write("							<li><a href=\"adminViewProduct.jsp?type=camera\">Camera</a></li>\r\n");
      out.write("							<li><a href=\"adminViewProduct.jsp?type=speaker\">Speakers</a></li>\r\n");
      out.write("							<li><a href=\"adminViewProduct.jsp?type=tablet\">Tablets</a></li>\r\n");
      out.write("						</ul></li>\r\n");
      out.write("					<li><a href=\"adminStock.jsp\">Stock</a></li>\r\n");
      out.write("					<li><a href=\"shippedItems.jsp\">Shipped</a></li>\r\n");
      out.write("					<li><a href=\"unshippedItems.jsp\">Orders</a></li>\r\n");
      out.write("					<!-- <li><a href=\"\"> <span class=\"glyphicon glyphicon-shopping-cart\"></span>&nbsp;Cart</a></li> -->\r\n");
      out.write("					<li class=\"dropdown\"><a class=\"dropdown-toggle\"\r\n");
      out.write("						data-toggle=\"dropdown\" href=\"#\">Update Items <span\r\n");
      out.write("							class=\"caret\"></span>\r\n");
      out.write("					</a>\r\n");
      out.write("						<ul class=\"dropdown-menu\">\r\n");
      out.write("							<li><a href=\"addProduct.jsp\">Add Product</a></li>\r\n");
      out.write("							<li><a href=\"removeProduct.jsp\">Remove Product</a></li>\r\n");
      out.write("							<li><a href=\"updateProductById.jsp\">Update Product</a></li>\r\n");
      out.write("						</ul></li>\r\n");
      out.write("					<li><a href=\"./LogoutServlet\">Logout</a></li>\r\n");
      out.write("\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</nav>\r\n");
      out.write("	");

	}
	
      out.write("\r\n");
      out.write("	<!-- End of Navigation Bar -->\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");

        String message = request.getParameter("message");
    
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row\" style=\"margin-top: 50px;\">\r\n");
      out.write("            <form action=\"./RegisterServlet\" method=\"post\" class=\"col-md-6 col-md-offset-3\"\r\n");
      out.write("                style=\"border: 1px solid #ccc; border-radius: 10px; background-color: #ffffff; padding: 30px; box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);\">\r\n");
      out.write("                <div class=\"text-center\">\r\n");
      out.write("                    <h2 style=\"color: #333; font-family: 'Arial', sans-serif; font-weight: bold;\">Registration Form</h2>\r\n");
      out.write("                    ");
 if (message != null) { 
      out.write("\r\n");
      out.write("                        <p style=\"color: red; font-weight: bold;\">\r\n");
      out.write("                            ");
      out.print(message);
      out.write("\r\n");
      out.write("                        </p>\r\n");
      out.write("                    ");
 } 
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-6 form-group\">\r\n");
      out.write("                        <label for=\"first_name\" style=\"font-weight: bold; color: #555;\">Name</label>\r\n");
      out.write("                        <input type=\"text\" name=\"username\" class=\"form-control\" id=\"first_name\" required\r\n");
      out.write("                            style=\"border-radius: 5px; padding: 10px; border: 1px solid #ccc;\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-6 form-group\">\r\n");
      out.write("                        <label for=\"email\" style=\"font-weight: bold; color: #555;\">Email</label>\r\n");
      out.write("                        <input type=\"email\" name=\"email\" class=\"form-control\" id=\"email\" required\r\n");
      out.write("                            style=\"border-radius: 5px; padding: 10px; border: 1px solid #ccc;\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label for=\"address\" style=\"font-weight: bold; color: #555;\">Address</label>\r\n");
      out.write("                    <textarea name=\"address\" class=\"form-control\" id=\"address\" required\r\n");
      out.write("                        style=\"border-radius: 5px; padding: 10px; border: 1px solid #ccc;\"></textarea>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-6 form-group\">\r\n");
      out.write("                        <label for=\"mobile\" style=\"font-weight: bold; color: #555;\">Mobile</label>\r\n");
      out.write("                        <input type=\"number\" name=\"mobile\" class=\"form-control\" id=\"mobile\" required\r\n");
      out.write("                            style=\"border-radius: 5px; padding: 10px; border: 1px solid #ccc;\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-6 form-group\">\r\n");
      out.write("                        <label for=\"pincode\" style=\"font-weight: bold; color: #555;\">Pin Code</label>\r\n");
      out.write("                        <input type=\"number\" name=\"pincode\" class=\"form-control\" id=\"pincode\" required\r\n");
      out.write("                            style=\"border-radius: 5px; padding: 10px; border: 1px solid #ccc;\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-6 form-group\">\r\n");
      out.write("                        <label for=\"password\" style=\"font-weight: bold; color: #555;\">Password</label>\r\n");
      out.write("                        <input type=\"password\" name=\"password\" class=\"form-control\" id=\"password\" required\r\n");
      out.write("                            style=\"border-radius: 5px; padding: 10px; border: 1px solid #ccc;\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-6 form-group\">\r\n");
      out.write("                        <label for=\"confirmPassword\" style=\"font-weight: bold; color: #555;\">Confirm Password</label>\r\n");
      out.write("                        <input type=\"password\" name=\"confirmPassword\" class=\"form-control\" id=\"confirmPassword\" required\r\n");
      out.write("                            style=\"border-radius: 5px; padding: 10px; border: 1px solid #ccc;\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"row text-center\">\r\n");
      out.write("                    <div class=\"col-md-6\" style=\"margin-bottom: 10px;\">\r\n");
      out.write("                        <button type=\"reset\" class=\"btn btn-danger\" style=\"padding: 10px 20px; border-radius: 5px;\">Reset</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-6\">\r\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary\" style=\"padding: 10px 20px; border-radius: 5px;\">Register</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    ");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>ShopMart</title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/changes.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background-color: rgb(255, 255, 255);\">\r\n");
      out.write("	<!-- Start the footer Contacts -->\r\n");
      out.write("	<!-- <a name=\"contact\"></a> -->\r\n");
      out.write("	<div class=\"container-fluid\"\r\n");
      out.write("		style=\"background-color: #454862; color: white; margin-top: 200px;\">\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<h3 class=\"text-center\">Contact US!</h3>\r\n");
      out.write("			<p class=\"text-center\">\r\n");
      out.write("				<em>Thanks for visit</em>\r\n");
      out.write("			</p>\r\n");
      out.write("			<div class=\"row test\">\r\n");
      out.write("				<div class=\"col-md-4\">\r\n");
      out.write("					<p>Provide Feedback</p>\r\n");
      out.write("					<p>\r\n");
      out.write("						<span class=\"glyphicon glyphicon-map-marker\"></span>Elas Dasalkar\r\n");
      out.write("					</p>\r\n");
      out.write("					<p>\r\n");
      out.write("						<span class=\"glyphicon glyphicon-phone\"></span>Phone: 0223 45659\r\n");
      out.write("					\r\n");
      out.write("					</p>\r\n");
      out.write("					<p>\r\n");
      out.write("						<span class=\"glyphicon glyphicon-envelope\"></span>Email:\r\n");
      out.write("						Revatureshop@gmail.com\r\n");
      out.write("					</p>\r\n");
      out.write("					\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-md-8\">\r\n");
      out.write("					<form action=\"fansMessage\" method=\"post\">\r\n");
      out.write("						<div class=\"row\">\r\n");
      out.write("							<div class=\"col-sm-6 form-group\">\r\n");
      out.write("								<input class=\"form-control\" id=\"name\" name=\"name\"\r\n");
      out.write("									placeholder=\"Name\" type=\"text\" required>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"col-sm-6 form-group\">\r\n");
      out.write("								<input class=\"form-control\" id=\"email\" name=\"email\"\r\n");
      out.write("									placeholder=\"Email\" type=\"email\" required>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("						<textarea class=\"form-control\" id=\"comments\" name=\"comments\"\r\n");
      out.write("							placeholder=\"Comment\" rows=\"5\" required></textarea>\r\n");
      out.write("						<div class=\"row\">\r\n");
      out.write("							<div class=\"col-md-12 form-group\">\r\n");
      out.write("								<button class=\"btn pull-right\" type=\"submit\">Send</button>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</form>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- End of Contact or about us -->\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
