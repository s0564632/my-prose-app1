
/*
 * Copyright (c) 2026 ro_bot (s0564632). All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://apache.org
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package de.htw_berlin.fb4.calculator.unisono.my_prose_app;

import de.htw_berlin.fb4.ossd.prose.Sentence;

public class FirstSentence implements Sentence {
    @Override
    public String get() {
        return "Die agile Entwickler*in";
    }
}
