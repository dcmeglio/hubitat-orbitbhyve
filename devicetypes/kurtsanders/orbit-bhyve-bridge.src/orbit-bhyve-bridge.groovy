/*
*  Name:	Orbit B•Hyve™ Bridge
*  Author: Kurt Sanders
*  Email:	Kurt@KurtSanders.com
*  Date:	3/2019
*  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License. You may obtain a copy of the License at:
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
*  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
*  for the specific language governing permissions and limitations under the License.
*
*/
def version() { return ["V4.01", "Requires Bhyve Orbit Controller"] }
// End Version Information
import groovy.time.*
import java.text.DecimalFormat
import java.text.SimpleDateFormat

metadata {
    definition (name: "Orbit Bhyve Bridge", namespace: "kurtsanders", author: "kurt@kurtsanders.com") {
        capability "Refresh"
        capability "Sensor"

        attribute "is_connected", "enum", ['true','false']
        attribute "id", "string"
        attribute "type", "string"
        attribute "firmware_version", "string"
        attribute "hardware_version", "string"
        attribute "schedulerFreq", "string"
        attribute "lastupdate", "string"
        attribute "statusText", "string"
        attribute "name","string"
        attribute "type","string"
    }
}

def refresh() {
    parent.refresh()
}