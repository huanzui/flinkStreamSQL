/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.dtstack.flink.sql;



import com.dtstack.flink.sql.exec.ExecuteProcessHelper;
import com.dtstack.flink.sql.exec.ParamsInfo;
import org.apache.flink.table.api.bridge.java.StreamTableEnvironment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Date: 2018/6/26
 * Company: www.dtstack.com
 * @author xuchao
 */

public class Main {
    private static final Logger LOG = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws Exception {
        ParamsInfo paramsInfo = ExecuteProcessHelper.parseParams(args);
        StreamTableEnvironment env = ExecuteProcessHelper.getStreamExecution(paramsInfo);
        env.execute(paramsInfo.getName());
        LOG.info("program {} execution success", paramsInfo.getName());
    }
}
