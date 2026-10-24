Function TXX4FXBDX4%(arg0%, arg1#, arg2#, arg3#, arg4#, arg5#, arg6#, arg7#, arg8%)
    Local local0#
    Local local1#
    Local local2#
    Local local3#
    Local local4#
    Local local5#
    Local local6#
    Local local7#
    Local local8#
    Local local9#
    Local local10#
    Local local11#
    Local local12#
    Local local13#
    Local local14#
    Local local15#
    Local local16#
    Local local17#
    Local local18#
    Local local19#
    Local local20#
    local0 = entityx(arg0, arg8, 1.0)
    local1 = entityy(arg0, arg8, 1.0)
    local2 = entityz(arg0, arg8, 1.0)
    local3 = arg1
    local4 = arg2
    local5 = arg3
    local6 = entitypitch(arg0, arg8, 1.0)
    local7 = entityyaw(arg0, arg8, 1.0)
    local8 = entityroll(arg0, arg8, 1.0)
    local9 = arg4
    local10 = arg5
    local11 = arg6
    local12 = (local3 - local0)
    local13 = (local4 - local1)
    local14 = (local5 - local2)
    local15 = sqr((((local12 * local12) + (local13 * local13)) + (local14 * local14)))
    If (0.0001 < local15) Then
        local16 = (fps\Field3[$00] * arg7)
        If (local16 >= local15) Then
            positionentity(arg0, local3, local4, local5, arg8)
            rotateentity(arg0, local9, local10, local11, arg8)
        Else
            local17 = (local16 / local15)
            local18 = angledist(local9, local6)
            local19 = angledist(local10, local7)
            local20 = angledist(local11, local8)
            positionentity(arg0, ((local12 * local17) + local0), ((local13 * local17) + local1), ((local14 * local17) + local2), arg8)
            rotateentity(arg0, wrapangle(((local18 * local17) + local6), 360.0), wrapangle(((local19 * local17) + local7), 360.0), wrapangle(((local20 * local17) + local8), 360.0), arg8)
        EndIf
    Else
        rotateentity(arg0, local9, local10, local11, arg8)
        Return $01
    EndIf
    Return $00
    Return $00
End Function
