Function TZ4ZB022Z8%(arg0.T82BBBXXXD, arg1%, arg2%, arg3#, arg4#, arg5#)
    Local local0#
    Local local1#
    Local local2#
    Local local3#
    Local local4#
    Local local5#
    Local local7#
    Local local8#
    Local local9#
    Local local10#
    Local local11#
    Local local12#
    Local local13#
    Local local14#
    local0 = meshx(arg2, $00)
    local1 = meshy(arg2, $00)
    local2 = meshz(arg2, $00)
    local3 = meshx(arg2, $01)
    local4 = meshy(arg2, $01)
    local5 = meshz(arg2, $01)
    entityphysics(arg1, $01)
    Select arg0\Field3
        Case "ellipse"
            local7 = ((meshwidth(arg2) * arg3) * 0.5)
            local8 = (((meshheight(arg2) * arg4) * 0.5) * arg0\Field2)
            entityradius(arg1, local7, local8)
            entitycenter(arg1, 0.0, local8, 0.0)
        Case "cylinder"
            local7 = ((meshwidth(arg2) * arg3) * 0.5)
            local8 = (((meshheight(arg2) * arg4) * 0.5) * arg0\Field2)
            entitycylinder(arg1, local7, local8)
            entitycenter(arg1, 0.0, local8, 0.0)
        Default
            local9 = ((local3 - local0) * arg3)
            local10 = (((local4 - local1) * arg4) * arg0\Field2)
            local11 = ((local5 - local2) * arg5)
            local12 = (local0 * arg3)
            local13 = (local1 * arg4)
            local14 = (local2 * arg5)
            entitybox(arg1, local12, local13, local14, local9, local10, local11)
    End Select
    entitymass(arg1, arg0\Field0)
    entityfriction(arg1, arg0\Field4)
    entitylineardamping(arg1, arg0\Field5)
    entityangulardamping(arg1, arg0\Field6)
    entityrestitution(arg1, arg0\Field1)
    Return $00
End Function
