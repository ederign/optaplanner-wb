/*
 * Copyright 2015 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.optaplanner.workbench.screens.domaineditor.client.widgets.planner;

import com.google.gwt.user.client.ui.IsWidget;

public interface PlannerDataObjectFieldEditorView
        extends IsWidget {

    interface Presenter {

        void onValueRangeProviderChange();

        void onValueRangeProviderIdChange();

        void onPlanningEntityCollectionChange();

        void onPlanningVariableChange();

        void onValueRangeProviderRefsChange();

    }

    void setPresenter( Presenter presenter );

    void setValueRangeProviderValue( boolean value );

    boolean getValueRangeProviderValue();

    void enableValueRangeProviderId( boolean enabled );

    void setValueRangeProviderIdValue( String value );

    String getValueRangeProviderIdValue();

    void setPlanningEntityCollectionValue( boolean value );

    boolean getPlanningEntityCollectionValue();

    void setPlanningVariableValue( boolean value );

    boolean getPlanningVariableValue();

    void enableValueRangeProviderRefs( boolean enabled );

    void setValueRangeProviderRefsValue( String value );

    String getValueRangeProviderRefsValue();

    void showPlanningSolutionSettingsPanel( boolean show );

    void showPlanningEntitySettingsPanel( boolean show );

    void clear();

}
