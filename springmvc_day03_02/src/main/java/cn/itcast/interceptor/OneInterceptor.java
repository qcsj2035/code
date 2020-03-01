package cn.itcast.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OneInterceptor implements HandlerInterceptor {
	/**
	 * 在运行目标方法之前执行该操作
	 *返回值代表是否是放行:true代表放行，false代表到此结束
	 * @param request
	 * @param response
	 * @param handler
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		System.out.println("拦截器");
		System.out.println(handler);
//		if (handler instanceof DefaultServletHttpRequestHandler){
//			return true;
//		}
		return false;
	}
}
