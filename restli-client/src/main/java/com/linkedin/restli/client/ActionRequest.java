/*
   Copyright (c) 2012 LinkedIn Corp.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/

/**
 * $Id: $
 */

package com.linkedin.restli.client;

import java.util.Map;

import com.linkedin.data.template.RecordTemplate;
import com.linkedin.restli.common.ResourceMethod;
import com.linkedin.restli.common.ResourceSpec;
import com.linkedin.restli.internal.client.ActionResponseDecoder;

/**
 * A request to perform an action.
 *
 * @author Steven Ihde
 * @author Eran Leshem
 */

public class ActionRequest<T> extends Request<T>
{
  private final Object _id;

  ActionRequest(RecordTemplate input,
                Map<String, String> headers,
                ActionResponseDecoder<T> decoder,
                ResourceSpec resourceSpec,
                Map<String, Object> queryParams,
                String name,
                String baseUriTemplate,
                Map<String, Object> pathKeys,
                Object id)
  {
    super(ResourceMethod.ACTION,
          input,
          headers,
          decoder,
          resourceSpec,
          queryParams,
          name,
          baseUriTemplate,
          pathKeys);
    _id = id;
  }

  public Object getId()
  {
    return _id;
  }
}
