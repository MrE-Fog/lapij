/*
 * // =========================================================================
 * // Copyright © 2019 T-Mobile USA, Inc.
 * //
 * // Licensed under the Apache License, Version 2.0 (the "License");
 * // you may not use this file except in compliance with the License.
 * // You may obtain a copy of the License at
 * //
 * //    http://www.apache.org/licenses/LICENSE-2.0
 * //
 * // Unless required by applicable law or agreed to in writing, software
 * // distributed under the License is distributed on an "AS IS" BASIS,
 * // WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * // See the License for the specific language governing permissions and
 * // limitations under the License.
 * // =========================================================================
 *
 */

package com.tmobile.ct.tep.qapi.tvaultclient.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class SecretsTest {

    private Secrets secrets;

    @Before
    public void setUp() {
        secrets = new Secrets();
        secrets.setData(new HashMap<>());
    }

    @Test
    public void getData() {
        Assert.assertNotNull(secrets.getData());
    }
}
