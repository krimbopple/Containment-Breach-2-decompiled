Function createsubtitlesmsg%(arg0$, arg1.sound, arg2$, arg3#, arg4%, arg5%, arg6%)
    Local local0%
    Local local1%
    Local local2.subtitlesmsg
    Local local3%
    Local local4.subtitlesmsg
    Local local5#
    Local local6#
    Local local7%
    If (XZ0260X8X2\Field61 <> 0) Then
        Return $00
    EndIf
    If (arg1 <> Null) Then
        local0 = $00
        For local1 = $00 To $0F Step $01
            If (ChannelPlaying(arg1\Field2[local1]) <> 0) Then
                local0 = $01
            EndIf
        Next
        If (local0 = $00) Then
            Return $00
        EndIf
    EndIf
    local2 = (New subtitlesmsg)
    local2\Field0 = arg0
    local2\Field8 = arg1
    local2\Field7 = arg2
    local2\Field6 = arg4
    local2\Field4 = arg5
    local2\Field11 = arg6
    local2\Field3 = arg3
    local2\Field10 = 0.0
    local2\Field1 = ""
    local2\Field2 = 0.0
    local3 = $00
    For local4 = Each subtitlesmsg
        local3 = (local3 + $01)
    Next
    local5 = ((subassets\Field3 + (Float subassets\Field5)) - (Float (subassets\Field5 * local3)))
    local6 = (Float (subassets\Field5 * local3))
    local7 = (Int ((Float subassets\Field5) + (10.0 * menuscale)))
    local2\Field9 = ((local5 + local6) - (Float local7))
    local2\Field5 = ((local5 + local6) - (Float local7))
    Insert local2 After (Last subtitlesmsg)
    Return $00
End Function
