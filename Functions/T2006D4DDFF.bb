Function T2006D4DDFF%()
    Local local0.TX2BF6X0FF4
    Local local1.T20BFZFZ62X
    For local1 = Each T20BFZFZ62X
        local1\Field6 = C6X880D2(local1)
    Next
    For local0 = Each TX2BF6X0FF4
        If (local0\Field13 > $01) Then
            blitz_TXXF80Z0FD00($06)
            blitz_TXXF80Z0FD00($05)
            EFFX8F602(local0\Field13, $03)
            For local1 = Each T20BFZFZ62X
                If (local1\Field17 = $00) Then
                    If (3600.0 > entitydistancesquared(local1\Field19, local0\Field52)) Then
                        If (TB042F626X(local0\Field13, $03, local1\Field2, local1\Field6) <> 0) Then
                            T6DZD4FZ60(AXXZXBDZ2(), local1)
                        EndIf
                    Else
                        TX4022X8Z0Z(local0\Field13, $03, local1\Field2, $FFFFFFFF)
                    EndIf
                EndIf
            Next
            If (BZ02XDD02(AXXZXBDZ2()) > $02) Then
                blitz_TXBFB002B8X0($00)
                XFD24F6402(local0\Field7, local0\Field25, $03, $02, $06)
            Else
                Z64Z02262()
            EndIf
        EndIf
    Next
    EZXZFF888($03)
    Return $00
End Function
