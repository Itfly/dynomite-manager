/**
 * Copyright 2013 Netflix, Inc.
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
package com.netflix.dynomitemanager.sidecore.aws;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.InstanceProfileCredentialsProvider;
import com.netflix.dynomitemanager.sidecore.ICredential;

public class IAMCredential implements ICredential
{
    private final InstanceProfileCredentialsProvider iamCredProvider;

    public IAMCredential()
    {
        this.iamCredProvider = new InstanceProfileCredentialsProvider();
    }

	public AWSCredentialsProvider getAwsCredentialProvider() 
	{
		return iamCredProvider;
	}
}
