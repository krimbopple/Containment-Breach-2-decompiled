Function GUESSEDsetanim_3%(arg0.items, arg1.TX2BF6X0FF4)
    blitz_TXBFB002B8X0(arg0\Field27)
    blitz_TXXF80Z0FD00($00)
    blitz_TXBFB002B8X0(arg0\Field6\Field23)
    blitz_TXBFB002B8X0(arg0\Field18)
    blitz_TXXF80Z0FD00(arg0\Field29)
    If (arg0\Field18 = $00) Then
        Select arg0\Field31
            Case $01
                blitz_ZXBBD60DX0(arg0\Field19)
                blitz_ZXBBD60DX0(arg0\Field24)
                blitz_TXXF80Z0FD00(arg0\Field16)
                blitz_TXXF80Z0FD00(arg0\Field14)
                blitz_TXXF80Z0FD00(arg0\Field38)
                blitz_TXXF80Z0FD00(GUESSEDcallclamp_7(arg0\Field1, 100.0))
                blitz_T2DD0DZDD40((Int min((Float (Int arg0\Field15)), 65535.0)))
            Case $02
                blitz_TXXF80Z0FD00(GUESSEDupdateobjects_34(arg0))
            Case $03,$05
                If (arg0\Field29 = arg1\Field13) Then
                    blitz_T2DD0DZDD40((Int arg0\Field15))
                EndIf
            Case $04
                blitz_TXXF80Z0FD00((Int animtime(arg0\Field5)))
            Case $06
                If (arg0\Field29 = arg1\Field13) Then
                    blitz_TXXF80Z0FD00((Int arg0\Field15))
                    blitz_T2DD0DZDD40((Int arg0\Field3))
                EndIf
            Case $07
                If (arg0\Field29 = arg1\Field13) Then
                    blitz_T2DD0DZDD40((Int arg0\Field15))
                    blitz_TXBFB002B8X0((Int arg0\Field3))
                EndIf
        End Select
    EndIf
    Return $00
End Function
