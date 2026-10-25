Function GUESSEDdrawsplit%(arg0.TX4BBZDZ08F, arg1%, arg2%, arg3#)
    Local local1%
    Local local2%
    Local local3%
    Local local4%
    Local local5$
    Local local6%
    Local local7%
    Local local8#
    Select arg0\Field3
        Case $01
            If (instr(arg0\Field0, " ", $01) <> 0) Then
                local5 = _SplitString(arg0\Field0, " ", $03)
                If (len(local5) = $00) Then
                    local5 = "255"
                EndIf
                local1 = (Int _SplitString(arg0\Field0, " ", $00))
                local2 = (Int _SplitString(arg0\Field0, " ", $01))
                local3 = (Int _SplitString(arg0\Field0, " ", $02))
                local4 = (Int ((Float (Int local5)) * arg3))
                color(local1, local2, local3, local4)
            Else
                local6 = _StrHex(arg0\Field0)
                If (len(arg0\Field0) = $06) Then
                    GUESSEDwriteintbytes(local6, local4, local1, local2, local3)
                    local4 = $FF
                Else
                    GUESSEDwriteintbytes(local6, local1, local2, local3, local4)
                EndIf
                color(local1, local2, local3, (Int ((Float local4) * arg3)))
            EndIf
        Case $02
            local7 = GUESSEDloadfiletype_3(arg0\Field0)
            If (local7 <> $00) Then
                local8 = ((Float fontheight()) * 1.2)
                resizeimage(local7, (Int local8), (Int local8))
                drawimage(local7, arg1, arg2, $01)
                Return (Int local8)
            EndIf
    End Select
    Return $00
    Return $00
End Function
