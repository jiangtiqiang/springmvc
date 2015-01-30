package auth;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.aspectj.weaver.ast.Var;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AuthInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
            Class<? extends Object> aVar=handler.getClass();
            Class<HandlerMethod> bVar=HandlerMethod.class;
//		if (handler.getClass().isAssignableFrom(HandlerMethod.class)) {
		if (1==1) {
			Check authPassport = ((HandlerMethod) handler)
					.getMethodAnnotation(Check.class);

			// 没有声明需要权限,或者声明不验证权限
//			if (authPassport == null || authPassport.validate() == false)
//				return false;
//			else {
				// 在这里实现自己的权限验证逻辑
				String token = request.getHeader("token");
				if (token.equals("123123..")){
					return true;
				} else {
					return false;
				}
//
//				if (false)// 如果验证成功返回true（这里直接写false来模拟验证失败的处理）
//					return true;
//				else// 如果验证失败
//				{
//					// 返回到登录界面
//					response.sendRedirect("account/login");
//					return false;
//				}
//			}
		} else
			return false;
	}
}