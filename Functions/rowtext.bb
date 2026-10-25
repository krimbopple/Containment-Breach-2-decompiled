Function rowtext%(arg0$, arg1%, arg2%, arg3%, arg4%, arg5%, arg6#)
    Local local0%
    Local local1#
    Local local2$
    Local local3%
    Local local4%
    Local local5%
    Local local6$
    Local local7%
    Local local8$
    If (arg4 < $01) Then
        arg4 = (Int smallest_power_two)
    EndIf
    arg0 = GUESSEDgettask(arg0)
    local0 = $00
    If (0.0 <= arg6) Then
        local1 = ((Float fontheight()) + arg6)
    Else
        local1 = ((Float fontheight()) * (Abs arg6))
    EndIf
    local2 = ""
    local3 = $00
    local4 = len(arg0)
    For local5 = $01 To local4 Step $01
        local6 = mid(arg0, local5, $01)
        If (local6 = chr($0A)) Then
            GUESSEDdrawtextrow($00, local2, arg1, (Int (((Float local0) * local1) + (Float arg2))), arg3, arg5, (Float local7), 0.0)
            local0 = (local0 + $01)
            local2 = ""
            local3 = $00
            If ((Float arg4) < ((Float (local0 + $01)) * local1)) Then
                Return local0
            EndIf
        Else
            local8 = (local2 + local6)
            If (local6 = " ") Then
                local3 = len(local8)
            EndIf
            If (stringwidth(replace(local8, chr($03), "X")) > arg3) Then
                If (local3 > $00) Then
                    GUESSEDdrawtextrow($00, left(local8, local3), arg1, (Int (((Float local0) * local1) + (Float arg2))), arg3, arg5, (Float local7), 0.0)
                    local0 = (local0 + $01)
                    local2 = right(local8, (len(local8) - local3))
                    local3 = $00
                Else
                    If (local2 <> "") Then
                        GUESSEDdrawtextrow($00, local2, arg1, (Int (((Float local0) * local1) + (Float arg2))), arg3, arg5, (Float local7), 0.0)
                        local0 = (local0 + $01)
                        local2 = local6
                    Else
                        GUESSEDdrawtextrow($00, local6, arg1, (Int (((Float local0) * local1) + (Float arg2))), arg3, arg5, (Float local7), 0.0)
                        local0 = (local0 + $01)
                        local2 = ""
                    EndIf
                    local3 = $00
                EndIf
                If ((Float arg4) < ((Float (local0 + $01)) * local1)) Then
                    Return local0
                EndIf
            Else
                local2 = local8
            EndIf
        EndIf
    Next
    If (local2 <> "") Then
        If ((Float arg4) >= ((Float (local0 + $01)) * local1)) Then
            GUESSEDdrawtextrow($00, local2, arg1, (Int (((Float local0) * local1) + (Float arg2))), arg3, arg5, (Float local7), 0.0)
            local0 = (local0 + $01)
        EndIf
    EndIf
    Return local0
    Return $00
End Function
