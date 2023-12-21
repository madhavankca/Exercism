class RnaTranscription {

    String transcribe(String dnaStrand) {
        StringBuilder rnaSequence = new StringBuilder();

        for (char nucleotide : dnaStrand.toCharArray()) {
            switch (nucleotide) {
                case 'G':
                    rnaSequence.append('C');
                    break;
                case 'C':
                    rnaSequence.append('G');
                    break;
                case 'T':
                    rnaSequence.append('A');
                    break;
                case 'A':
                    rnaSequence.append('U');
                    break;
                /*default:
                    break;*/
            }
        }
        return rnaSequence.toString();
    }
}
