// ============================================================================
//
// Copyright (C) 2006-2019 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.resources.export.route.setting.repository.node;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.preference.PreferencePage;
import org.talend.designer.maven.ui.setting.repository.node.RepositoryMavenSettingNode;
import org.talend.resources.export.route.setting.repository.page.RoutesKarafPomRepositorySettingPage;

/**
 * DOC ggu class global comment. Detailled comment
 */
public class RoutesKarafPomRepositorySettingNode extends RepositoryMavenSettingNode {

    public RoutesKarafPomRepositorySettingNode(String id, IFile pomFile) {
        super(id, pomFile);
    }

    @Override
    protected PreferencePage createPreferencePage() {
        return new RoutesKarafPomRepositorySettingPage(getFile());
    }
}
