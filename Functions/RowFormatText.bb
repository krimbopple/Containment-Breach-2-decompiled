Function RowFormatText%(arg0$, arg1%, arg2%, arg3%, arg4%, arg5%, arg6#, arg7#, arg8#)
    Local local0%
    Local local1#
    Local local2%
    Local local3$
    Local local4%
    Local local5%
    Local local6%
    Local local7$
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
    local2 = $00
    local3 = ""
    local4 = $00
    local5 = len(arg0)
    For local6 = $01 To local5 Step $01
        local7 = mid(arg0, local6, $01)
        If (local7 = chr($0A)) Then
            If (GUESSEDdrawtextrow($01, local3, arg1, (Int (((Float local0) * local1) + (Float arg2))), arg3, arg5, arg7, arg8) <> 0) Then
                local2 = $01
            EndIf
            local0 = (local0 + $01)
            local3 = ""
            local4 = $00
            If ((Float arg4) < ((Float (local0 + $01)) * local1)) Then
                Return local2
            EndIf
        Else
            local8 = (local3 + local7)
            If (local7 = " ") Then
                local4 = len(local8)
            EndIf
            If (stringwidth(replace(local8, chr($03), "X")) > arg3) Then
                If (local4 > $00) Then
                    If (GUESSEDdrawtextrow($01, left(local8, local4), arg1, (Int (((Float local0) * local1) + (Float arg2))), arg3, arg5, arg7, arg8) <> 0) Then
                        local2 = $01
                    EndIf
                    local0 = (local0 + $01)
                    local3 = right(local8, (len(local8) - local4))
                    local4 = $00
                Else
                    If (local3 <> "") Then
                        If (GUESSEDdrawtextrow($01, local3, arg1, (Int (((Float local0) * local1) + (Float arg2))), arg3, arg5, arg7, arg8) <> 0) Then
                            local2 = $01
                        EndIf
                        local0 = (local0 + $01)
                        local3 = local7
                    Else
                        If (GUESSEDdrawtextrow($01, local7, arg1, (Int (((Float local0) * local1) + (Float arg2))), arg3, arg5, arg7, arg8) <> 0) Then
                            local2 = $01
                        EndIf
                        local0 = (local0 + $01)
                        local3 = ""
                    EndIf
                    local4 = $00
                EndIf
                If ((Float arg4) < ((Float (local0 + $01)) * local1)) Then
                    Return local2
                EndIf
            Else
                local3 = local8
            EndIf
        EndIf
    Next
    If (local3 <> "") Then
        If ((Float arg4) >= ((Float (local0 + $01)) * local1)) Then
            If (GUESSEDdrawtextrow($01, local3, arg1, (Int (((Float local0) * local1) + (Float arg2))), arg3, arg5, arg7, arg8) <> 0) Then
                local2 = $01
            EndIf
        EndIf
    EndIf
    Return local2
    Return $00
End Function
