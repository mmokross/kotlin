/*
 * Copyright 2010-2022 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.project.structure

import org.jetbrains.kotlin.extensions.ProjectExtensionDescriptor

/**
 * A service which can return extensions which are registered for some module
 */
public abstract class KtCompilerPluginsProvider {
    /**
     * Returns a list of extensions of a base [extensionType] which are registered for [module]
     */
    public abstract fun <T : Any> getRegisteredExtensions(module: KtSourceModule, extensionType: ProjectExtensionDescriptor<T>): List<T>
}
