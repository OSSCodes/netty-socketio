/**
 * Copyright (c) 2012-2023 Nikita Koksharov
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package codes.oss.socketio.ack;

import java.util.UUID;

import codes.oss.socketio.scheduler.SchedulerKey;

public class AckSchedulerKey extends SchedulerKey {

    private final long index;

    public AckSchedulerKey(Type type, UUID sessionId, long index) {
        super(type, sessionId);
        this.index = index;
    }

    public long getIndex() {
        return index;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + (int) (index ^ (index >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        AckSchedulerKey other = (AckSchedulerKey) obj;
        if (index != other.index)
            return false;
        return true;
    }

}
