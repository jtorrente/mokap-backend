/**
 *  Copyright [2014] [mokap.es]
 *
 *    This file is part of the mokap community backend (MCB).
 *    MCB is licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package es.eucm.mokap.backend.model.search;

/**
 * Created by mario on 09/12/2014. Class that represents the parameters needed
 * to perform a text search in the database
 */
public class TextSearchParams extends SearchParams {
	private String searchString;

	/**
	 * Default Constructor
	 * 
	 * @param searchString
	 *            string that contains the text we are searching for
	 */
	public TextSearchParams(String searchString, String searchCursor) {
		super(searchCursor);
		this.searchString = searchString;
	}

	@Override
	public String getSearchQuery() {
		return this.searchString;
	}

	public String toString() {
		return "Search String: " + this.getSearchString()
				+ System.lineSeparator() + "Search Cursor: "
				+ this.getSearchCursor() + System.lineSeparator();
	}

	public String getSearchString() {
		return searchString;
	}

	public void setSearchString(String searchString) {
		this.searchString = searchString;
	}
}
