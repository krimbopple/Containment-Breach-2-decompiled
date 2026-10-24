Function updateinput$(arg0$, arg1%)
    Local local0%
    Local local1%
    Local local2%
    Local local3%
    Local local4%
    Local local5%
    Local local6%
    Local local7$
    Local local8%
    Local local9%
    Local local11$
    Local local12$
    Local local13$
    local0 = len(arg0)
    If (cursorpos < $00) Then
        cursorpos = local0
    EndIf
    cursorpos = (Int max(0.0, min((Float cursorpos), (Float local0))))
    If (TZFXXZB824 < $00) Then
        TZFXXZB824 = cursorpos
    EndIf
    local1 = (keydown($2A) Lor keydown($36))
    local2 = (keydown($1D) Lor keydown($9D))
    local3 = (TZFXXZB824 <> cursorpos)
    local4 = (Int min((Float cursorpos), (Float TZFXXZB824)))
    local5 = (Int max((Float cursorpos), (Float TZFXXZB824)))
    local6 = millisecs()
    If ((local2 And (local1 = $00)) <> 0) Then
        If (keyhit($1E) <> 0) Then
            TZFXXZB824 = $00
            cursorpos = local0
        EndIf
        If (keyhit($2E) <> 0) Then
            If (local3 <> 0) Then
                setclipboardcontents(mid(arg0, (local4 + $01), (local5 - local4)))
            EndIf
        EndIf
        If (keyhit($2D) <> 0) Then
            If (local3 <> 0) Then
                setclipboardcontents(mid(arg0, (local4 + $01), (Int max((Float (local5 - local4)), 0.0))))
                arg0 = (left(arg0, local4) + right(arg0, (Int max(0.0, (Float (local0 - local5))))))
                cursorpos = local4
                TZFXXZB824 = cursorpos
            EndIf
        EndIf
        If (keyhit($2F) <> 0) Then
            local7 = getclipboardcontents()
            If (local7 <> "") Then
                If (local3 <> 0) Then
                    arg0 = (left(arg0, local4) + right(arg0, (Int max(0.0, (Float (local0 - local5))))))
                    cursorpos = local4
                    local0 = len(arg0)
                EndIf
                arg0 = ((left(arg0, cursorpos) + local7) + right(arg0, (Int max(0.0, (Float (local0 - cursorpos))))))
                cursorpos = (cursorpos + len(local7))
                TZFXXZB824 = cursorpos
                If (((arg1 > $00) And (len(arg0) > arg1)) <> 0) Then
                    arg0 = left(arg0, arg1)
                    cursorpos = (Int min((Float cursorpos), (Float arg1)))
                    TZFXXZB824 = cursorpos
                EndIf
            EndIf
        EndIf
        If (keyhit($CB) <> 0) Then
            cursorpos = $00
            If (local1 = $00) Then
                TZFXXZB824 = cursorpos
            EndIf
        EndIf
        If (keyhit($CD) <> 0) Then
            cursorpos = local0
            If (local1 = $00) Then
                TZFXXZB824 = cursorpos
            EndIf
        EndIf
        flushkeys()
        Return arg0
    EndIf
    If (keyhit($D2) <> 0) Then
        insertmode = (insertmode = $00)
    EndIf
    If (keyhit($C7) <> 0) Then
        cursorpos = $00
        If (local1 = $00) Then
            TZFXXZB824 = cursorpos
        EndIf
    EndIf
    If (keyhit($CF) <> 0) Then
        cursorpos = local0
        If (local1 = $00) Then
            TZFXXZB824 = cursorpos
        EndIf
    EndIf
    local8 = $00
    If (keydown($0E) <> 0) Then
        local8 = $0E
    ElseIf (keydown($D3) <> 0) Then
        local8 = $D3
    ElseIf (keydown($CB) <> 0) Then
        local8 = $CB
    ElseIf (keydown($CD) <> 0) Then
        local8 = $CD
    EndIf
    local9 = $00
    If (local8 <> $00) Then
        If (T488266F4D <> local8) Then
            XX0B2X4688 = (local6 + $190)
            T488266F4D = local8
            local9 = $01
        ElseIf (local6 > XX0B2X4688) Then
            XX0B2X4688 = (local6 + $1E)
            local9 = $01
        EndIf
    Else
        T488266F4D = $00
    EndIf
    If (local9 <> 0) Then
        Select local8
            Case $D3
                If (local3 <> 0) Then
                    arg0 = (left(arg0, local4) + right(arg0, (Int max(0.0, (Float (local0 - local5))))))
                    cursorpos = local4
                    TZFXXZB824 = cursorpos
                ElseIf (cursorpos < local0) Then
                    arg0 = (left(arg0, cursorpos) + right(arg0, (Int max(0.0, (Float ((local0 - cursorpos) - $01))))))
                EndIf
            Case $0E
                If (local3 <> 0) Then
                    arg0 = (left(arg0, local4) + right(arg0, (Int max(0.0, (Float (local0 - local5))))))
                    cursorpos = local4
                    TZFXXZB824 = cursorpos
                ElseIf (cursorpos > $00) Then
                    arg0 = (left(arg0, (cursorpos - $01)) + right(arg0, (Int max(0.0, (Float (local0 - cursorpos))))))
                    cursorpos = (cursorpos - $01)
                    TZFXXZB824 = cursorpos
                EndIf
            Case $CB
                cursorpos = (Int max((Float (cursorpos - $01)), 0.0))
                If (local1 = $00) Then
                    TZFXXZB824 = cursorpos
                EndIf
            Case $CD
                cursorpos = (Int min((Float (cursorpos + $01)), (Float local0)))
                If (local1 = $00) Then
                    TZFXXZB824 = cursorpos
                EndIf
        End Select
        local0 = len(arg0)
        local4 = (Int min((Float cursorpos), (Float TZFXXZB824)))
        local5 = (Int max((Float cursorpos), (Float TZFXXZB824)))
        local3 = (TZFXXZB824 <> cursorpos)
    EndIf
    local11 = left(arg0, cursorpos)
    local12 = textinput(local11)
    If (local12 <> local11) Then
        If (len(local12) > len(local11)) Then
            local13 = right(local12, (Int max((Float (len(local12) - len(local11))), 0.0)))
            If (local3 <> 0) Then
                arg0 = (left(arg0, local4) + right(arg0, (Int max(0.0, (Float (local0 - local5))))))
                cursorpos = local4
                TZFXXZB824 = cursorpos
                local0 = len(arg0)
            EndIf
            arg0 = ((left(arg0, cursorpos) + local13) + right(arg0, (Int max(0.0, (Float (local0 - cursorpos))))))
            cursorpos = (cursorpos + len(local13))
            TZFXXZB824 = cursorpos
            If (((arg1 > $00) And (len(arg0) > arg1)) <> 0) Then
                arg0 = left(arg0, arg1)
                cursorpos = (Int min((Float cursorpos), (Float arg1)))
                TZFXXZB824 = cursorpos
            EndIf
        EndIf
    EndIf
    Return arg0
    Return ""
End Function
