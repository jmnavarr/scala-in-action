/*
 * Copyright 2015 Heiko Seeberger
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

object ScalaInActionApp {

  final val Intro = """| ____            _         _            _        _   _
                       |/ ___|  ___ __ _| | __ _  (_)_ __      / \   ___| |_(_) ___  _ __
                       |\___ \ / __/ _` | |/ _` | | | '_ \    / _ \ / __| __| |/ _ \| '_ \
                       | ___) | (_| (_| | | (_| | | | | | |  / ___ \ (__| |_| | (_) | | | |
                       ||____/ \___\__,_|_|\__,_| |_|_| |_| /_/   \_\___|\__|_|\___/|_| |_|
                       |
                       |Heiko Seeberger  /  codecentric  /  Twitter: @hseeberger
                       |""".stripMargin

  def main(args: Array[String]): Unit = println(Intro)
}
