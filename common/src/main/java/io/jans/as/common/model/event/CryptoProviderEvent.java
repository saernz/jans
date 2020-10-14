/*
 * Janssen Project software is available under the MIT License (2008). See http://opensource.org/licenses/MIT for full text.
 *
 * Copyright (c) 2020, Janssen Project
 */

package io.jans.as.common.model.event;


import javax.enterprise.util.AnnotationLiteral;
import javax.inject.Qualifier;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author Yuriy Zabrovarnyy
 */
@Qualifier
@Retention(RUNTIME)
@Target({ METHOD, FIELD, PARAMETER, TYPE })
@Documented
public @interface CryptoProviderEvent {

    final class Literal extends AnnotationLiteral<CryptoProviderEvent> implements CryptoProviderEvent {

        public static final CryptoProviderEvent.Literal INSTANCE = new CryptoProviderEvent.Literal();

        private static final long serialVersionUID = 1L;

    }
}
