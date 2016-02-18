/**
 * @author Wenxi Zhao
 */

package com.wanted.ws.remote;

import com.wanted.entities.Pack;

public interface SocketClientInterface {
	boolean openConnection();
    Object handleSession(Object request);
    void closeSession();
}
