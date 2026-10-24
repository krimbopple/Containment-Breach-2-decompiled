Function B240DB4F%()
    If ((((Int XZ0260X8X2\Field48) And (0.0 >= FD020X0BZ\Field2)) And (XZ0260X8X2\Field40 = $FFFFFFFF)) <> 0) Then
        If (FD020X0BZ\Field5 <> 0) Then
            Select FD020X0BZ\Field8
                Case $00
                    If (((FD020X0BZ\Field11 <> Null) And (XXDB6F64F2[FD020X0BZ\Field11\Field3] <> Null)) <> 0) Then
                        playerroom = XXDB6F64F2[FD020X0BZ\Field11\Field3]
                        showroomsnocoll(playerroom)
                        showroomscoll(playerroom)
                    EndIf
                Case $01
                    If (((FD020X0BZ\Field11 <> Null) And (XXDB6F64F2[FD020X0BZ\Field11\Field3] <> Null)) <> 0) Then
                        playerroom = XXDB6F64F2[FD020X0BZ\Field11\Field3]
                        showroomsnocoll(playerroom)
                        showroomscoll(playerroom)
                    EndIf
            End Select
        EndIf
    EndIf
    Return $00
End Function
