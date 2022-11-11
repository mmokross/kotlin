/*
 * Copyright 2010-2022 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.test.runners.codegen;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.test.generators.GenerateCompilerTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/codegen/asmLike")
@TestDataPath("$PROJECT_ROOT")
public class IrAsmLikeInstructionListingTestGenerated extends AbstractIrAsmLikeInstructionListingTest {
    @Test
    public void testAllFilesPresentInAsmLike() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/codegen/asmLike"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
    }

    @Nested
    @TestMetadata("compiler/testData/codegen/asmLike/receiverMangling")
    @TestDataPath("$PROJECT_ROOT")
    public class ReceiverMangling {
        @Test
        public void testAllFilesPresentInReceiverMangling() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/codegen/asmLike/receiverMangling"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
        }

        @Test
        @TestMetadata("deepInline.kt")
        public void testDeepInline() throws Exception {
            runTest("compiler/testData/codegen/asmLike/receiverMangling/deepInline.kt");
        }

        @Test
        @TestMetadata("deepInlineWithLabels.kt")
        public void testDeepInlineWithLabels() throws Exception {
            runTest("compiler/testData/codegen/asmLike/receiverMangling/deepInlineWithLabels.kt");
        }

        @Test
        @TestMetadata("deepNoinlineWithLabels_after.kt")
        public void testDeepNoinlineWithLabels_after() throws Exception {
            runTest("compiler/testData/codegen/asmLike/receiverMangling/deepNoinlineWithLabels_after.kt");
        }

        @Test
        @TestMetadata("deepNoinlineWithLabels_before.kt")
        public void testDeepNoinlineWithLabels_before() throws Exception {
            runTest("compiler/testData/codegen/asmLike/receiverMangling/deepNoinlineWithLabels_before.kt");
        }

        @Test
        @TestMetadata("deepNoinline_after.kt")
        public void testDeepNoinline_after() throws Exception {
            runTest("compiler/testData/codegen/asmLike/receiverMangling/deepNoinline_after.kt");
        }

        @Test
        @TestMetadata("deepNoinline_before.kt")
        public void testDeepNoinline_before() throws Exception {
            runTest("compiler/testData/codegen/asmLike/receiverMangling/deepNoinline_before.kt");
        }

        @Test
        @TestMetadata("inlineClassCapture.kt")
        public void testInlineClassCapture() throws Exception {
            runTest("compiler/testData/codegen/asmLike/receiverMangling/inlineClassCapture.kt");
        }

        @Test
        @TestMetadata("inlineReceivers.kt")
        public void testInlineReceivers() throws Exception {
            runTest("compiler/testData/codegen/asmLike/receiverMangling/inlineReceivers.kt");
        }

        @Test
        @TestMetadata("localFunctions.kt")
        public void testLocalFunctions() throws Exception {
            runTest("compiler/testData/codegen/asmLike/receiverMangling/localFunctions.kt");
        }

        @Test
        @TestMetadata("mangledNames.kt")
        public void testMangledNames() throws Exception {
            runTest("compiler/testData/codegen/asmLike/receiverMangling/mangledNames.kt");
        }

        @Test
        @TestMetadata("nonInlineReceivers_after.kt")
        public void testNonInlineReceivers_after() throws Exception {
            runTest("compiler/testData/codegen/asmLike/receiverMangling/nonInlineReceivers_after.kt");
        }

        @Test
        @TestMetadata("nonInlineReceivers_before.kt")
        public void testNonInlineReceivers_before() throws Exception {
            runTest("compiler/testData/codegen/asmLike/receiverMangling/nonInlineReceivers_before.kt");
        }
    }

    @Nested
    @TestMetadata("compiler/testData/codegen/asmLike/typeAnnotations")
    @TestDataPath("$PROJECT_ROOT")
    public class TypeAnnotations {
        @Test
        public void testAllFilesPresentInTypeAnnotations() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/codegen/asmLike/typeAnnotations"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
        }

        @Test
        @TestMetadata("classTypeParameter.kt")
        public void testClassTypeParameter() throws Exception {
            runTest("compiler/testData/codegen/asmLike/typeAnnotations/classTypeParameter.kt");
        }

        @Test
        @TestMetadata("complex.kt")
        public void testComplex() throws Exception {
            runTest("compiler/testData/codegen/asmLike/typeAnnotations/complex.kt");
        }

        @Test
        @TestMetadata("constructor.kt")
        public void testConstructor() throws Exception {
            runTest("compiler/testData/codegen/asmLike/typeAnnotations/constructor.kt");
        }

        @Test
        @TestMetadata("defaultArgs.kt")
        public void testDefaultArgs() throws Exception {
            runTest("compiler/testData/codegen/asmLike/typeAnnotations/defaultArgs.kt");
        }

        @Test
        @TestMetadata("dontEmit.kt")
        public void testDontEmit() throws Exception {
            runTest("compiler/testData/codegen/asmLike/typeAnnotations/dontEmit.kt");
        }

        @Test
        @TestMetadata("enumClassConstructor.kt")
        public void testEnumClassConstructor() throws Exception {
            runTest("compiler/testData/codegen/asmLike/typeAnnotations/enumClassConstructor.kt");
        }

        @Test
        @TestMetadata("extension.kt")
        public void testExtension() throws Exception {
            runTest("compiler/testData/codegen/asmLike/typeAnnotations/extension.kt");
        }

        @Test
        @TestMetadata("functionTypeParameter.kt")
        public void testFunctionTypeParameter() throws Exception {
            runTest("compiler/testData/codegen/asmLike/typeAnnotations/functionTypeParameter.kt");
        }

        @Test
        @TestMetadata("implicit.kt")
        public void testImplicit() throws Exception {
            runTest("compiler/testData/codegen/asmLike/typeAnnotations/implicit.kt");
        }

        @Test
        @TestMetadata("innerClassConstructor.kt")
        public void testInnerClassConstructor() throws Exception {
            runTest("compiler/testData/codegen/asmLike/typeAnnotations/innerClassConstructor.kt");
        }

        @Test
        @TestMetadata("jvmOverload.kt")
        public void testJvmOverload() throws Exception {
            runTest("compiler/testData/codegen/asmLike/typeAnnotations/jvmOverload.kt");
        }

        @Test
        @TestMetadata("jvmStatic.kt")
        public void testJvmStatic() throws Exception {
            runTest("compiler/testData/codegen/asmLike/typeAnnotations/jvmStatic.kt");
        }

        @Test
        @TestMetadata("notYetSupported.kt")
        public void testNotYetSupported() throws Exception {
            runTest("compiler/testData/codegen/asmLike/typeAnnotations/notYetSupported.kt");
        }

        @Test
        @TestMetadata("property.kt")
        public void testProperty() throws Exception {
            runTest("compiler/testData/codegen/asmLike/typeAnnotations/property.kt");
        }

        @Test
        @TestMetadata("propertyTypeParameter.kt")
        public void testPropertyTypeParameter() throws Exception {
            runTest("compiler/testData/codegen/asmLike/typeAnnotations/propertyTypeParameter.kt");
        }

        @Test
        @TestMetadata("simple.kt")
        public void testSimple() throws Exception {
            runTest("compiler/testData/codegen/asmLike/typeAnnotations/simple.kt");
        }

        @Test
        @TestMetadata("simple2Params.kt")
        public void testSimple2Params() throws Exception {
            runTest("compiler/testData/codegen/asmLike/typeAnnotations/simple2Params.kt");
        }

        @Test
        @TestMetadata("staticNested.kt")
        public void testStaticNested() throws Exception {
            runTest("compiler/testData/codegen/asmLike/typeAnnotations/staticNested.kt");
        }

        @Test
        @TestMetadata("syntheticAccessors.kt")
        public void testSyntheticAccessors() throws Exception {
            runTest("compiler/testData/codegen/asmLike/typeAnnotations/syntheticAccessors.kt");
        }

        @Test
        @TestMetadata("typeParameter.kt")
        public void testTypeParameter() throws Exception {
            runTest("compiler/testData/codegen/asmLike/typeAnnotations/typeParameter.kt");
        }

        @Test
        @TestMetadata("typeParameter16.kt")
        public void testTypeParameter16() throws Exception {
            runTest("compiler/testData/codegen/asmLike/typeAnnotations/typeParameter16.kt");
        }
    }
}
