Function getlineamount%(arg0$, arg1%, arg2%, arg3#)
    Local local0%
    Local local1#
    Local local2$
    Local local3%
    Local local4%
    Local local5%
    Local local6$
    Local local7$
    If (arg2 < $01) Then
        arg2 = (Int smallest_power_two)
    EndIf
    arg0 = XX8XZZFFF(arg0)
    local0 = $00
    If (0.0 <= arg3) Then
        local1 = ((Float fontheight()) + arg3)
    Else
        local1 = ((Float fontheight()) * (Abs arg3))
    EndIf
    local2 = ""
    local3 = $00
    local4 = len(arg0)
    For local5 = $01 To local4 Step $01
        local6 = mid(arg0, local5, $01)
        If (local6 = chr($0A)) Then
            local0 = (local0 + $01)
            local2 = ""
            local3 = $00
            If ((Float arg2) < ((Float (local0 + $01)) * local1)) Then
                Return local0
            EndIf
        Else
            local7 = (local2 + local6)
            If (local6 = " ") Then
                local3 = len(local7)
            EndIf
            If (stringwidth(replace(local7, chr($03), "X")) > arg1) Then
                If (local3 > $00) Then
                    local0 = (local0 + $01)
                    local2 = right(local7, (len(local7) - local3))
                    local3 = $00
                Else
                    local0 = (local0 + $01)
                    If (local2 <> "") Then
                        local2 = local6
                    Else
                        local2 = ""
                    EndIf
                    local3 = $00
                EndIf
                If ((Float arg2) < ((Float (local0 + $01)) * local1)) Then
                    Return local0
                EndIf
            Else
                local2 = local7
            EndIf
        EndIf
    Next
    If (local2 <> "") Then
        If ((Float arg2) >= ((Float (local0 + $01)) * local1)) Then
            local0 = (local0 + $01)
        EndIf
    EndIf
    Return local0
    Return $00
End Function
