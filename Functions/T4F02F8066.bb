Function T4F02F8066%(arg0.items, arg1%)
    Local local1%
    Local local2%
    Local local3%
    Local local4#
    Select arg0\Field31
        Case $01
            arg0\Field19 = blitz_T2X820D0FD0()
            arg0\Field24 = blitz_T2X820D0FD0()
            local1 = blitz_TX28D20DD080()
            local2 = blitz_TX28D20DD080()
            local3 = blitz_TX28D20DD080()
            local4 = TZ80Z2860X(blitz_TX28D20DD080(), 100.0)
            If (((((arg0\Field16 <> local1) Lor (arg0\Field14 <> local2)) Lor (arg0\Field38 <> local3)) Lor (local4 <> arg0\Field1)) <> 0) Then
                arg0\Field16 = local1
                arg0\Field14 = local2
                arg0\Field38 = local3
                arg0\Field1 = local4
                If (countchildren(arg0\Field5) > $00) Then
                    entitycolor(getchild(arg0\Field5, $01), (Float arg0\Field16), (Float arg0\Field14), (Float arg0\Field38))
                    entityalpha(getchild(arg0\Field5, $01), (Abs arg0\Field1))
                EndIf
            EndIf
            arg0\Field15 = (Float blitz_XXXBBZ4F2Z0())
        Case $02
            FB0BDFX4B(arg0, (blitz_TX28D20DD080() = $00))
        Case $03,$05
            If (arg1 = TXXDZB2ZBXX()) Then
                arg0\Field23 = (Float blitz_XXXBBZ4F2Z0())
            EndIf
        Case $04
            setanimtime(arg0\Field5, (Float blitz_TX28D20DD080()), $00)
        Case $06
            If (arg1 = TXXDZB2ZBXX()) Then
                arg0\Field23 = (Float blitz_TX28D20DD080())
                arg0\Field2 = (Float blitz_XXXBBZ4F2Z0())
            EndIf
        Case $07
            If (arg1 = TXXDZB2ZBXX()) Then
                arg0\Field23 = (Float blitz_XXXBBZ4F2Z0())
                arg0\Field2 = (Float blitz_T20024FDF4X0())
            EndIf
    End Select
    Return $00
End Function
