Function TDBDBZ6FFD.T6068XB4Z2(arg0.TX2BF6X0FF4, arg1%, arg2#, arg3#, arg4#, arg5#, arg6#, arg7#, arg8#, arg9#, arg10$, arg11$, arg12$, arg13%, arg14$, arg15%, arg16%)
    Local local0%
    Local local1.T6068XB4Z2
    Local local2.T24B4ZF6F6
    Local local3#
    Local local4#
    Local local5#
    Local local6#
    Local local7#
    Local local8.emitter
    local0 = misc_i\Field3
    local1 = (New T6068XB4Z2)
    local2 = X4DZBDB0DZ(arg1)
    If (((local2 <> Null) And (local2\Field0 <> $00)) <> 0) Then
        local0 = local2\Field0
    ElseIf (local2 <> Null) Then
        X08D2FXZ42(("Unable to load shell model: " + local2\Field3\Field48))
    EndIf
    If (local2 <> Null) Then
        If (local2\Field3\Field46 <> 0) Then
            local1\Field2 = Y0846Z64F8(strippath(local2\Field3\Field48))
        EndIf
        local1\Field39 = local2\Field3\Field62
        local1\Field32 = local2\Field3\Field38
        local1\Field1 = local2\Field3\Field27
        local1\Field4 = 8.0
    EndIf
    local1\Field31 = createpivot($00)
    local1\Field9 = copyentity(local0, local1\Field31)
    local1\Field37 = arg3
    local1\Field35 = (arg4 * 70.0)
    local1\Field6 = arg14
    local1\Field18 = arg13
    local1\Field34 = arg6
    local1\Field20 = arg5
    local1\Field23 = arg2
    local1\Field42 = (arg9 * 70.0)
    local1\Field40 = arg0
    local1\Field38 = arg12
    local1\Field15 = arg10
    local1\Field41 = arg11
    local1\Field24 = arg8
    local1\Field12 = arg1
    local1\Field13 = (T2FFB8B2F0() + $3E8)
    local1\Field19 = -1.0
    local1\Field43 = arg7
    local1\Field11 = 30.0
    local1\Field21 = arg15
    entitydestructor(local1\Field31, FuncPtr(CB86FF8Z8))
    X62DD0204B(local1)
    E8FD84BZX(local1\Field15)
    scaleentity(local1\Field9, entityscalex(local0, $01, 1.0), entityscaley(local0, $01, 1.0), entityscalez(local0, $01, 1.0), $00)
    If (arg0 <> Null) Then
        local3 = entityx(arg0\Field54, $01, 1.0)
        local4 = entityy(arg0\Field54, $01, 1.0)
        local5 = entityz(arg0\Field54, $01, 1.0)
        local6 = entitypitch(arg0\Field54, $01, 1.0)
        local7 = entityyaw(arg0\Field54, $01, 1.0)
    EndIf
    positionentity(local1\Field31, local3, local4, local5, $00)
    rotateentity(local1\Field31, local6, local7, 0.0, $00)
    moveentity(local1\Field31, 0.0, 0.0, local1\Field37, $00)
    local1\Field22 = (entityx(local1\Field31, $00, 1.0) - local3)
    local1\Field26 = (entityy(local1\Field31, $00, 1.0) - local4)
    local1\Field5 = (entityz(local1\Field31, $00, 1.0) - local5)
    positionentity(local1\Field31, local3, local4, local5, $00)
    moveentity(local1\Field31, 0.0, 0.0, 0.1, $00)
    If (local1\Field18 >= $00) Then
        local8 = setemitter(Null, entityx(local1\Field31, $00, 1.0), entityy(local1\Field31, $00, 1.0), entityz(local1\Field31, $00, 1.0), local1\Field18)
        If (local8 <> Null) Then
            entityparent(local8\Field2, local1\Field31, $01)
        EndIf
    EndIf
    entitytype(local1\Field31, $08, $00)
    If (local1\Field2 <> Null) Then
        TZ4ZB022Z8(local1\Field2, local1\Field31, local0, entityscalex(local0, $01, 1.0), entityscaley(local0, $01, 1.0), entityscalez(local0, $01, 1.0))
        entitylinearvelocity(local1\Field31, (local1\Field22 / local1\Field2\Field0), (local1\Field26 / local1\Field2\Field0), (local1\Field5 / local1\Field2\Field0))
    Else
        entityradius(local1\Field31, arg8, 0.0)
    EndIf
    X8880BD8FB(local1, arg16)
    Return local1
    Return Null
End Function
