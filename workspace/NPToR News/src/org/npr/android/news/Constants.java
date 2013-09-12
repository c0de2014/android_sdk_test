// Copyright 2009 Google Inc.
// Copyright 2011 NPR
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.npr.android.news;

public class Constants {
  public static final String EXTRA_SUBACTIVITY_ID = "subactivity_id";
  public static final String EXTRA_STATION_ID = "station_id";
  public static final String EXTRA_STORY_ID = "story_id";
  public static final String EXTRA_TOPIC_ID = "topic_id";
  public static final String EXTRA_QUERY_TERM = "query_term";
  public static final String EXTRA_QUERY_URL = "query_url";
  public static final String EXTRA_ACTIVITY_DATA = "activity_data";

  public static final String EXTRA_DESCRIPTION = "extra_description";
  public static final String EXTRA_GROUPING = "extra_grouping";
  public static final String EXTRA_SIZE = "extra_size";
  public static final String EXTRA_LIVE_STREAM_RSS_URL =
    "guide.publicbroadcasting.net query url";
  public static final String EXTRA_STORY_ID_LIST = "list_of_story_ids";
  public static final String EXTRA_STATION_LIST_MODE =
      "mode_for_station_list_activity";
  public static final String EXTRA_ON_AIR = "program_is_on_air";
  public static final String EXTRA_PODCAST_URL = "podcast_rss_feed_url";
  public static final String EXTRA_TEASER_ONLY = "teaser_only";
  private Constants() {
    // no instantiation
  }
}
