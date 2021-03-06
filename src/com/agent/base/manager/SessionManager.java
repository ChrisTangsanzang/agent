package com.agent.base.manager;

import com.agent.base.cache.session.SessionCacheFactory;
import com.agent.base.vo.AgentSession;

public class SessionManager {
	/**
	 * 从缓存中提取Session
	 * @param uuid
	 * @return
	 */
	public static AgentSession getSession(String uid){
		return SessionCacheFactory.getSessionCache().getSessionCache(uid);
	}
	
	/**
	 * 刷新Session
	 * @param session
	 */
	public static void refreshSession(AgentSession session){
		SessionCacheFactory.getSessionCache().setSessionCache(session);
	}

}
