Function YX440XFZX4%(arg0.TX2BF6X0FF4)
    If (arg0 = TXXF6F02DB2[TXXDZB2ZBXX()]) Then
        If ((Int XZ0260X8X2\Field48) <> 0) Then
            resetnegativestats($01)
            If (X2Z260BF0Z\Field1[$0C] <> $00) Then
                freeentity(X2Z260BF0Z\Field1[$0C])
                X2Z260BF0Z\Field1[$0C] = $00
            EndIf
            XZ0260X8X2\Field38 = $02
            If (FD020X0BZ\Field10 <> Null) Then
                teleportentity(XZ0260X8X2\Field74, FD020X0BZ\Field6, (FD020X0BZ\Field7 + 0.2), FD020X0BZ\Field0, 0.3, $00, 2.0, $00)
                playerroom = FD020X0BZ\Field10
            Else
                XXDDBX88Z8()
            EndIf
            T8660BZ460\Field3 = $00
            T8660BZ460\Field10 = $00
            T8660BZ460\Field6 = $00
            T8660BZ460\Field7 = $00
            T8660BZ460\Field8 = $00
            T8660BZ460\Field11 = $00
            FD020X0BZ\Field2 = 100.0
        EndIf
    EndIf
    If ((TXB2BFFFFFX() And arg0\Field46\Field46) <> 0) Then
        arg0\Field46\Field12 = 0.0
        arg0\Field46\Field9 = 0.0
        arg0\Field46\Field27 = 0.0
        arg0\Field46\Field19 = 0.0
        arg0\Field46\Field49 = 0.0
        arg0\Field46\Field33 = 210.0
        arg0\Field46\Field51 = 1.0
        arg0\Field46\Field40 = 0.0
        arg0\Field46\Field46 = $00
        arg0\Field46\Field24 = $00
        TX46F82X2Z0(arg0, $01, $00)
    EndIf
    Return $00
End Function
