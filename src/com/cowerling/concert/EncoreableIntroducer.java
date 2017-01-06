package com.cowerling.concert;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * Created by dell on 2017-1-4.
 */
@Aspect
public class EncoreableIntroducer {
    @DeclareParents(value = "com.cowerling.concert.Performance", defaultImpl = DefaultEncoreable.class)
    public static Encoreable encoreable;
}
