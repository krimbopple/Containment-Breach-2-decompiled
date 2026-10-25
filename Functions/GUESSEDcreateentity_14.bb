Function GUESSEDcreateentity_14.TB8DZX8886(arg0.rooms, arg1#, arg2#, arg3#, arg4#, arg5%, arg6%, arg7%, arg8#, arg9#, arg10#, arg11#, arg12#, arg13#, arg14%)
    Local local0.TB8DZX8886
    local0 = (New TB8DZX8886)
    local0\Field1 = arg0
    local0\Field6 = arg11
    local0\Field4 = (arg4 / 10.0)
    local0\Field3 = createpivot($00)
    positionentity(local0\Field3, arg1, arg2, arg3, $00)
    local0\Field0 = copyentity(misc_i\Field2, $00)
    positionentity(local0\Field0, arg1, arg2, arg3, $00)
    rotateentity(local0\Field0, 270.0, 0.0, 0.0, $00)
    scaleentity(local0\Field0, (0.01 * arg13), (0.01 * arg13), (0.01 * arg13), $00)
    entitycolor(local0\Field0, (Float arg5), (Float arg6), (Float arg7))
    entityalpha(local0\Field0, 0.01)
    entityblend(local0\Field0, $03)
    entityparent(local0\Field0, local0\Field3, $01)
    local0\Field5 = copyentity(misc_i\Field2, $00)
    positionentity(local0\Field5, arg1, arg2, arg3, $00)
    rotateentity(local0\Field5, 90.0, 0.0, 0.0, $00)
    scaleentity(local0\Field5, (0.01 * arg13), (0.01 * arg13), (0.01 * arg13), $00)
    entitycolor(local0\Field5, (Float arg5), (Float arg6), (Float arg7))
    entityalpha(local0\Field5, 0.01)
    entityblend(local0\Field5, $03)
    entityparent(local0\Field5, local0\Field3, $01)
    local0\Field2 = addlight(Null, arg1, arg2, arg3, $03, local0\Field4, arg5, arg6, arg7, $00, arg13, arg14)
    local0\Field2\Field0 = arg12
    local0\Field2\Field17 = 0.0
    rotateentity(local0\Field2\Field7, 0.0, 0.0, 0.0, $00)
    entityparent(local0\Field2\Field7, local0\Field3, $01)
    local0\Field2 = addlight(Null, arg1, arg2, arg3, $03, local0\Field4, arg5, arg6, arg7, $00, arg13, arg14)
    local0\Field2\Field0 = arg12
    local0\Field2\Field17 = 0.0
    rotateentity(local0\Field2\Field7, 180.0, 0.0, 0.0, $00)
    entityparent(local0\Field2\Field7, local0\Field3, $01)
    rotateentity(local0\Field3, arg8, arg9, arg10, $00)
    entityparent(local0\Field3, arg0\Field15, $01)
    Return local0
    Return Null
End Function
