package layers;

import java.util.List;
import java.util.Random;

public class FullyConnectedLayer extends Layer{

    private long SEED;

    private double[][] _weights;
    private int _inLength;
    private int _outLength;

    public FullyConnectedLayer(int _inLength, int _outLength, long SEED) {
        this._inLength = _inLength;
        this._outLength = _outLength;
        this.SEED = SEED;

        _weights = new double[_inLength][_outLength];
        setRandomWeights();
    }

    

    @Override
    public double[] getOutput(List<double[][]> input) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getOutput'");
    }

    @Override
    public double[] getOutput(double[] input) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getOutput'");
    }

    @Override
    public void backPropagation(List<double[][]> dLdO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'backPropagation'");
    }

    @Override
    public void backPropagation(double[] dLdO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'backPropagation'");
    }

    @Override
    public int getOutputLength() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getOutputLength'");
    }

    @Override
    public int getOutputRows() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getOutputRows'");
    }

    @Override
    public int getOutputCols() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getOutputCols'");
    }

    @Override
    public int getOutputElements() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getOutputElements'");
    }

    public void setRandomWeights(){
        Random random = new Random(SEED);

        for(int i = 0; i < _inLength; i++){
            for(int j = 0; j < _outLength; j++){
                _weights[i][j] = random.nextGaussian();
            }
        }
    }

    public double reLu(double input){
        if(input <= 0){
            return 0;
        } else {
            return input;
        }
    }

}
