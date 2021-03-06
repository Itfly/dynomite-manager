/**
 * Copyright 2016 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.netflix.dynomitemanager.sidecore.storage;

public class MemcachedStorageProxy implements IStorageProxy {

    @Override
    public boolean isAlive() {
        return false;
    }

    @Override
    public long getUptime() {
        return 0;
    }

    @Override
    public boolean warmUpStorage(String[] peers) {
        // TODO Auto-generated method stub
        return false;
    }
    
    @Override
    public boolean resetStorage() {
    	return true;
    }
    
    @Override
    public boolean takeSnapshot() {
    	return false;
    }
    
    @Override
    public boolean loadingData() {
    	return false;
    }
    
}
